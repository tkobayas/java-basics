package com.sample;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandleTest2 {

    public static void main(String[] args) throws Throwable {

        // ルックアップ作成
        MethodHandles.Lookup lookup = MethodHandles.lookup();

        // メソッドのタイプ作成
        // 返り値がStringで、int, String を引数にとるメソッドという事
        MethodType mt = MethodType.methodType(String.class);

        // メソッドハンドルの取得
        MethodHandle mh = lookup.findVirtual(Sample.class, "getData", mt);

        // コールするメソッドのインスタンス
        Sample o = new Sample();

        // メソッドコール
        String ret = (String) mh.invokeExact(o);
        
        System.out.println(ret);

    }
}
