package com.baidu.mobstat;

import java.io.File;
import java.util.Comparator;

class an
  implements Comparator<File>
{
  an(al paramal) {}
  
  public int a(File paramFile1, File paramFile2)
  {
    return (int)(paramFile2.lastModified() - paramFile1.lastModified());
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes2-dex2jar.jar!/com/baidu/mobstat/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */