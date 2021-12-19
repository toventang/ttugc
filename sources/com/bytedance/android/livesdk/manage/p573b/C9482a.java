package com.bytedance.android.livesdk.manage.p573b;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.gift.LiveNewAssetsCachePathSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.ugc.live.p4460a.p4461a.C87020c;
import com.p2082ss.ugc.live.p4460a.p4461a.p4462a.AbstractC87012b;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.manage.b.a */
public final class C9482a implements AbstractC87012b {

    /* renamed from: b */
    public static String f23027b;

    /* renamed from: c */
    public static final C9483a f23028c = new C9483a((byte) 0);

    /* renamed from: a */
    public final String f23029a;

    /* renamed from: d */
    private final String f23030d;

    /* renamed from: com.bytedance.android.livesdk.manage.b.a$a */
    public static final class C9483a {
        static {
            Covode.recordClassIndex(10992);
        }

        private C9483a() {
        }

        public /* synthetic */ C9483a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.p4462a.AbstractC87012b
    /* renamed from: a */
    public final String mo16300a() {
        return this.f23030d;
    }

    static {
        String str;
        Covode.recordClassIndex(10991);
        if (LiveNewAssetsCachePathSetting.INSTANCE.getValue()) {
            str = "gift_assets";
        } else {
            str = "assets";
        }
        f23027b = str;
    }

    /* renamed from: a */
    private static File m17780a(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.p4462a.AbstractC87012b
    /* renamed from: a */
    public final String mo16301a(C87020c cVar) {
        C89219l.m154721d(cVar, "");
        return this.f23030d + File.separator + cVar.f196193e + File.separator;
    }

    public C9482a(Context context) {
        C89219l.m154721d(context, "");
        if (LiveNewAssetsCachePathSetting.INSTANCE.getValue()) {
            StringBuilder sb = new StringBuilder();
            File a = m17780a(context);
            C89219l.m154716b(a, "");
            this.f23030d = sb.append(a.getAbsolutePath()).append(File.separator).append("gift_assets").toString();
            File dir = context.getDir("assets", 0);
            C89219l.m154716b(dir, "");
            String absolutePath = dir.getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            this.f23029a = absolutePath;
            return;
        }
        File dir2 = context.getDir("assets", 0);
        C89219l.m154716b(dir2, "");
        String absolutePath2 = dir2.getAbsolutePath();
        C89219l.m154716b(absolutePath2, "");
        this.f23030d = absolutePath2;
        StringBuilder sb2 = new StringBuilder();
        File a2 = m17780a(context);
        C89219l.m154716b(a2, "");
        this.f23029a = sb2.append(a2.getAbsolutePath()).append(File.separator).append("gift_assets").toString();
    }
}
