package cz.msebera.android.httpclient.i.d;

import cz.msebera.android.httpclient.annotation.Immutable;
import cz.msebera.android.httpclient.f.l;
import cz.msebera.android.httpclient.f.n;

@Immutable
public class o
  extends a
{
  public void a(n paramn, String paramString)
    throws l
  {
    cz.msebera.android.httpclient.o.a.a(paramn, "Cookie");
    if (paramString == null) {
      throw new l("Missing value for version attribute");
    }
    int i = 0;
    try
    {
      int j = Integer.parseInt(paramString);
      i = j;
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    paramn.a(i);
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes3-dex2jar.jar!/cz/msebera/android/httpclient/i/d/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */