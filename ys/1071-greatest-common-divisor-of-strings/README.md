<h2><a href="https://leetcode.com/problems/greatest-common-divisor-of-strings">1071. Greatest Common Divisor of Strings</a></h2><h3>Easy</h3><hr><p>For two strings <code>s</code> and <code>t</code>, we say &quot;<code>t</code> divides <code>s</code>&quot; if and only if <code>s = t + t + t + ... + t + t</code> (i.e., <code>t</code> is concatenated with itself one or more times).</p>

<p>Given two strings <code>str1</code> and <code>str2</code>, return <em>the largest string </em><code>x</code><em> such that </em><code>x</code><em> divides both </em><code>str1</code><em> and </em><code>str2</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> str1 = &quot;ABCABC&quot;, str2 = &quot;ABC&quot;
<strong>Output:</strong> &quot;ABC&quot;
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> str1 = &quot;ABABAB&quot;, str2 = &quot;ABAB&quot;
<strong>Output:</strong> &quot;AB&quot;
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> str1 = &quot;LEET&quot;, str2 = &quot;CODE&quot;
<strong>Output:</strong> &quot;&quot;
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= str1.length, str2.length &lt;= 1000</code></li>
	<li><code>str1</code> and <code>str2</code> consist of English uppercase letters.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">solution : gcd(great common division) 최대공약수/ 유클리드 호제법</strong></p>

<ul>
	<li>두 문자열을 결합했을 때 순서가 다르면 공통 문자열이 존재하지 않음</li>
	<li>문자열의 길이로 최대공약수를 구하면 가장 큰 공통 패턴의 길이를 알 수 있음.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Big-O</strong></p>

<ul>
	<li>문자열 비교는 O(n)</li>
	<li>최대공약수 계산은 O(log(min(m, n)))</li>
	<li>전체 시간 복잡도는 O(n + log(min(m, n)))</li>
</ul>
