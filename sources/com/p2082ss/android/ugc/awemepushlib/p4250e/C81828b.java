package com.p2082ss.android.ugc.awemepushlib.p4250e;

import android.net.Uri;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.ss.android.ugc.awemepushlib.e.b */
public final class C81828b {

    /* renamed from: a */
    public static Keva f182961a = Keva.getRepo("push_video_preload");

    /* renamed from: b */
    private static final List<C81827a> f182962b = new ArrayList();

    /* renamed from: c */
    private static int f182963c = 10;

    /* renamed from: d */
    private static final Comparator<C81827a> f182964d = new Comparator<C81827a>() {
        /* class com.p2082ss.android.ugc.awemepushlib.p4250e.C81828b.C818291 */

        static {
            Covode.recordClassIndex(95242);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C81827a aVar, C81827a aVar2) {
            C81827a aVar3 = aVar;
            C81827a aVar4 = aVar2;
            if (aVar3.f182960b == aVar4.f182960b) {
                return 0;
            }
            if (aVar3.f182960b > aVar4.f182960b) {
                return -1;
            }
            return 1;
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.awemepushlib.e.b$a */
    public static class RunnableC81830a implements Runnable {

        /* renamed from: a */
        private final String f182965a;

        static {
            Covode.recordClassIndex(95243);
        }

        public final void run() {
            if (C17867d.m33078a() != null) {
                try {
                    C81828b.f182961a.storeString("preload_items", this.f182965a);
                } catch (Exception unused) {
                }
            }
        }

        private RunnableC81830a(String str) {
            this.f182965a = str;
        }

        /* synthetic */ RunnableC81830a(String str, byte b) {
            this(str);
        }
    }

    static {
        Covode.recordClassIndex(95241);
    }

    /* renamed from: a */
    public static int m141710a(long j) {
        try {
            String string = f182961a.getString("preload_items", "");
            if (!C13627m.m24498a(string)) {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (j == jSONArray.getJSONObject(i).optLong("id", 0)) {
                        return 1;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /* renamed from: a */
    public static boolean m141712a(String str) {
        String str2;
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return false;
        }
        boolean contains = str.contains("aweme/push_detail");
        if (!"aweme".equals(parse.getHost())) {
            return false;
        }
        try {
            str2 = parse.getQueryParameter("gd_label");
        } catch (Throwable unused) {
            str2 = "";
        }
        if ("click_push_recommend".equals(str2) || "click_push_newvideo".equals(str2) || "click_push_ops".equals(str2) || "click_push_commentvideo".equals(str2) || "click_push_commentvideo_reply".equals(str2) || contains) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x009e */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a8 A[Catch:{ Exception -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00da A[Catch:{ Exception -> 0x00ff }, LOOP:2: B:42:0x00d4->B:44:0x00da, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001a A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.lang.Object m141711a(com.p2082ss.android.ugc.awemepushlib.p4247c.C81823b r15) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.awemepushlib.p4250e.C81828b.m141711a(com.ss.android.ugc.awemepushlib.c.b):java.lang.Object");
    }
}
