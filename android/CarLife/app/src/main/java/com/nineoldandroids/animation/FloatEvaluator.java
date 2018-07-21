package com.nineoldandroids.animation;

public class FloatEvaluator
  implements TypeEvaluator<Number>
{
  public Float evaluate(float paramFloat, Number paramNumber1, Number paramNumber2)
  {
    float f = paramNumber1.floatValue();
    return Float.valueOf((paramNumber2.floatValue() - f) * paramFloat + f);
  }
}


/* Location:              /Users/objectyan/Documents/OY/baiduCarLife_40/dist/classes3-dex2jar.jar!/com/nineoldandroids/animation/FloatEvaluator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */