package com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53515a;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53516b;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.e */
public abstract class AbstractC53583e implements AbstractC34467b, AbstractC53516b {

    /* renamed from: e */
    public static final C53584a f122992e = new C53584a((byte) 0);

    /* renamed from: c */
    public final WeakReference<Context> f122993c;

    /* renamed from: d */
    public AbstractC53515a f122994d;

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.e$b */
    public enum EnumC53585b {
        TAKE_PHOTO,
        PICK_PHOTO_FROM_ALBUM,
        TAKE_VIDEO,
        PICK_VIDEO_FROM_ALBUM,
        UNSUPPORTED;
        
        public static final C53586a Companion = new C53586a((byte) 0);

        static {
            Covode.recordClassIndex(63161);
        }

        /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.e$b$a */
        public static final class C53586a {
            static {
                Covode.recordClassIndex(63162);
            }

            private C53586a() {
            }

            public /* synthetic */ C53586a(byte b) {
                this();
            }
        }
    }

    static {
        Covode.recordClassIndex(63159);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.e$a */
    public static final class C53584a {
        static {
            Covode.recordClassIndex(63160);
        }

        private C53584a() {
        }

        public /* synthetic */ C53584a(byte b) {
            this();
        }
    }

    public AbstractC53583e(WeakReference<Context> weakReference) {
        C89219l.m154721d(weakReference, "");
        this.f122993c = weakReference;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b
    /* renamed from: a */
    public final boolean mo60905a(int i, int i2, Intent intent) {
        if (i == 1 || i == 700 || i == 800 || i == 10003 || i == 10004) {
            AbstractC53515a aVar = this.f122994d;
            if (aVar == null) {
                C89219l.m154710a("mIFileMediaFeature");
            }
            aVar.mo90105a(i, i2, intent);
        } else {
            mo90106a(0, "Unrecognized request code");
        }
        return true;
    }
}
