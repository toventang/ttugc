package com.bytedance.framwork.core.p1005c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;

/* renamed from: com.bytedance.framwork.core.c.c */
public final class C14806c {

    /* renamed from: a */
    public static AbstractC14808b f36084a = new C14807a();

    /* renamed from: b */
    public static boolean f36085b;

    /* renamed from: com.bytedance.framwork.core.c.c$a */
    public static class C14807a implements AbstractC14808b {
        static {
            Covode.recordClassIndex(16907);
        }

        @Override // com.bytedance.framwork.core.p1005c.C14806c.AbstractC14808b
        /* renamed from: a */
        public final boolean mo23834a(Context context) {
            return false;
        }
    }

    /* renamed from: com.bytedance.framwork.core.c.c$b */
    public interface AbstractC14808b {
        static {
            Covode.recordClassIndex(16908);
        }

        /* renamed from: a */
        boolean mo23834a(Context context);
    }

    static {
        Covode.recordClassIndex(16906);
    }

    /* renamed from: a */
    public static byte[] m27182a(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return str.getBytes("UTF-8");
                }
            } catch (UnsupportedEncodingException unused) {
                return str.getBytes();
            }
        }
        return null;
    }
}
