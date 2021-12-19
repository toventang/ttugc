package com.p2082ss.android.ugc.aweme.shortvideo.p3836i;

import android.app.Activity;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.EmbaddedWindowInfo;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.i.n */
public class C71889n {

    /* renamed from: a */
    public static final String f161073a = C71889n.class.getSimpleName();

    static {
        Covode.recordClassIndex(84438);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.i.n$a */
    public static class C71890a {
        static {
            Covode.recordClassIndex(84439);
        }

        /* renamed from: a */
        public static String m126963a(String str) {
            MethodCollector.m26663i(1139);
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                FileInputStream f = C84896h.m145873f(str);
                if (f == null) {
                    MethodCollector.m26664o(1139);
                    return null;
                }
                byte[] bArr = new byte[8192];
                int i = 0;
                while (true) {
                    try {
                        int read = f.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        i += read;
                        int i2 = i - 524288;
                        if (i2 >= 0) {
                            instance.update(bArr, 0, read - i2);
                            break;
                        }
                        instance.update(bArr, 0, read);
                    } catch (IOException e) {
                        C63244g.m114602a().mo73263I().mo101637a((Throwable) e);
                        try {
                            f.close();
                        } catch (IOException unused) {
                        }
                        MethodCollector.m26664o(1139);
                        return null;
                    } catch (Throwable th) {
                        try {
                            f.close();
                        } catch (IOException unused2) {
                        }
                        MethodCollector.m26664o(1139);
                        throw th;
                    }
                }
                String replace = C1764a.m5928a("%32s", new Object[]{new BigInteger(1, instance.digest()).toString(16)}).replace(' ', '0');
                try {
                    f.close();
                } catch (IOException unused3) {
                }
                MethodCollector.m26664o(1139);
                return replace;
            } catch (NoSuchAlgorithmException unused4) {
                MethodCollector.m26664o(1139);
                return null;
            }
        }
    }

    /* renamed from: a */
    public static String m126959a(Activity activity, ShortVideoContext shortVideoContext) {
        List<EmbaddedWindowInfo> list;
        String path = shortVideoContext.f155817b.f155652h.mo110089a().getPath();
        Integer valueOf = Integer.valueOf((int) shortVideoContext.f155817b.f155651g);
        Integer valueOf2 = Integer.valueOf(shortVideoContext.f155817b.f155647c);
        Integer valueOf3 = Integer.valueOf(shortVideoContext.f155817b.f155648d);
        if (shortVideoContext.f155817b.mo109889b()) {
            list = shortVideoContext.f155817b.f155659o.f155690l;
        } else {
            list = null;
        }
        return m126960a(path, valueOf, valueOf2, valueOf3, list);
    }

    /* renamed from: a */
    private static String m126961a(List<String> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, List<List<EmbaddedWindowInfo>> list5) {
        return m126962a(true, false, list, list2, list3, list4, null, list5);
    }

    /* renamed from: a */
    public static String m126960a(String str, Integer num, Integer num2, Integer num3, List<EmbaddedWindowInfo> list) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(str);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add(num);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(num2);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add(num3);
        if (list != null) {
            arrayList = new ArrayList();
            arrayList.add(list);
        } else {
            arrayList = null;
        }
        return m126961a(arrayList2, arrayList3, arrayList4, arrayList5, arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068 A[SYNTHETIC, Splitter:B:28:0x0068] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m126962a(boolean r16, boolean r17, java.util.List<java.lang.String> r18, java.util.List<java.lang.Integer> r19, java.util.List<java.lang.Integer> r20, java.util.List<java.lang.Integer> r21, java.util.List<java.lang.String> r22, java.util.List<java.util.List<com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.EmbaddedWindowInfo>> r23) {
        /*
        // Method dump skipped, instructions count: 389
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71889n.m126962a(boolean, boolean, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):java.lang.String");
    }
}
