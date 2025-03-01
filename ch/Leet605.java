package ch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int[] duplicated = Arrays.copyOf(flowerbed, flowerbed.length);
        if(n==0){
            return true;
        }

        if(duplicated.length == 1){
            return duplicated[0] != n;
        }

        for(int i =0; i< duplicated.length; i++){
            if(i ==0 ) {
                if((duplicated[i] == duplicated[i+1]) && (duplicated[i] ==0)){
                    duplicated[i] = 1;
                }
            } else if(i == duplicated.length - 1){
                if((duplicated[i] == duplicated[i-1]) && (duplicated[i] ==0)){
                    duplicated[i] = 1;
                }
            } else {
                if((duplicated[i-1] == duplicated[i]) && (duplicated[i] == duplicated[i+1]) && duplicated[i] == 0){
                    duplicated[i] = 1;
                }
            }

        }

        System.out.println(Arrays.toString(duplicated));
        count = 0;
        for(int i =0; i< duplicated.length; i++){
            duplicated[i] = duplicated[i] -flowerbed[i];

            if(duplicated[i] ==1){
                count++;
            }
        }



        System.out.println(Arrays.toString(duplicated));


        return count >= n;
    }
}

// V2
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // n이 0이면 항상 true
        if (n == 0) return true;

        // 배열 길이가 1인 경우 특별 처리
        if (flowerbed.length == 1) {
            return flowerbed[0] == 0 && n <= 1;
        }

        int[] flower = Arrays.copyOf(flowerbed, flowerbed.length);
        int flowersPlanted = 0;

        // 꽃을 심을 수 있는 위치 찾기
        for (int i = 0; i < flower.length; i++) {
            if (canPlantFlower(flower, i)) {
                flower[i] = 1;
                flowersPlanted++;
            }
        }

        return flowersPlanted >= n;
    }

    // 특정 위치에 꽃을 심을 수 있는지 확인하는 메서드
    private boolean canPlantFlower(int[] flower, int position) {
        // 현재 위치가 이미 심어져 있으면 false
        if (flower[position] == 1) return false;

        if (position == 0) {
            // 맨 앞자리인 경우
            return flower[1] == 0;
        } else if (position == flower.length - 1) {
            // 맨 뒷자리인 경우
            return flower[position - 1] == 0;
        } else {
            // 중간 위치인 경우
            return flower[position - 1] == 0 && flower[position + 1] == 0;
        }
    }
}


v2
class Solution {
    public String reverseVowels(String s) {
        // 모음 배열
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        // 모음을 저장할 리스트
        List<Character> vowelList = new ArrayList<>();
        char[] chars = s.toCharArray();  // String을 char 배열로 변환

        // 첫번째 순회: 모음 찾아서 리스트에 저장
        for (char c : chars) {
            for (char vowel : vowels) {
                if (c == vowel) {
                    vowelList.add(c);
                    break;  // 모음 찾았으면 더 이상 검사할 필요 없음
                }
            }
        }

        // 모음 리스트 뒤집기
        Collections.reverse(vowelList);

        // 두번째 순회: 모음 교체
        int vowelIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            for (char vowel : vowels) {
                if (chars[i] == vowel) {
                    chars[i] = vowelList.get(vowelIndex++);
                    break;
                }
            }
        }

        return new String(chars);
    }
}


v3
class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        // char 배열 사용 (String 배열보다 효율적)
        char[] chars = s.toCharArray();

        // 투 포인터 방식 사용
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // 왼쪽에서 모음 찾기
            while (left < right && !vowels.contains(chars[left])) {
                left++;
            }

            // 오른쪽에서 모음 찾기
            while (left < right && !vowels.contains(chars[right])) {
                right--;
            }

            // 모음 교환
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }
}
