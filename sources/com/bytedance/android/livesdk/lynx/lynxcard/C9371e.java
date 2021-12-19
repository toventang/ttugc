package com.bytedance.android.livesdk.lynx.lynxcard;

import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.e */
public final class C9371e {

    /* renamed from: a */
    public final Uri f22861a;

    /* renamed from: b */
    public final View f22862b;

    /* renamed from: c */
    public final int f22863c;

    /* renamed from: d */
    public final AbstractC9372a f22864d;

    /* renamed from: e */
    public final boolean f22865e;

    /* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.e$a */
    public interface AbstractC9372a {
        static {
            Covode.recordClassIndex(10879);
        }

        /* renamed from: a */
        void mo12783a(String str);
    }

    static {
        Covode.recordClassIndex(10878);
    }

    public /* synthetic */ C9371e(Uri uri, int i, AbstractC9372a aVar) {
        this(uri, null, i, aVar, false);
    }

    public C9371e(Uri uri, View view, int i, AbstractC9372a aVar, boolean z) {
        C89219l.m154721d(uri, "");
        this.f22861a = uri;
        this.f22862b = view;
        this.f22863c = i;
        this.f22864d = aVar;
        this.f22865e = z;
    }
}
