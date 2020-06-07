学习笔记

本周最大的收获是听覃超老师说递归的模板，感觉以前碰到递归很头疼，现在一下子有点思路了。争取把递归的模板背下来：
递归代码模板

// Java
public void recur(int level, int param) { 
  // terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); 
  // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 
}