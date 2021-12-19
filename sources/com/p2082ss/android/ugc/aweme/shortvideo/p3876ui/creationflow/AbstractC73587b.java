package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74171f;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.creationflow.b */
public abstract class AbstractC73587b<RETURN_VALUE> {
    static {
        Covode.recordClassIndex(86325);
    }

    private AbstractC73587b() {
    }

    public /* synthetic */ AbstractC73587b(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.creationflow.b$a */
    public static final class C73588a extends AbstractC73587b<Intent> {

        /* renamed from: a */
        public final C73586a f165401a;

        static {
            Covode.recordClassIndex(86326);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73588a(C73586a aVar) {
            super((byte) 0);
            C89219l.m154721d(aVar, "");
            this.f165401a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.creationflow.b$c */
    public static final class C73590c extends AbstractC73587b<C89391z> {

        /* renamed from: a */
        public final Activity f165406a;

        static {
            Covode.recordClassIndex(86328);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73590c(Activity activity) {
            super((byte) 0);
            C89219l.m154721d(activity, "");
            this.f165406a = activity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.creationflow.b$d */
    public static final class C73591d extends AbstractC73587b<C89391z> {

        /* renamed from: a */
        public final Activity f165407a;

        /* renamed from: b */
        public final boolean f165408b;

        static {
            Covode.recordClassIndex(86329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73591d(Activity activity, boolean z) {
            super((byte) 0);
            C89219l.m154721d(activity, "");
            this.f165407a = activity;
            this.f165408b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.creationflow.b$b */
    public static final class C73589b extends AbstractC73587b<C89391z> {

        /* renamed from: a */
        public final Activity f165402a;

        /* renamed from: b */
        public final C74171f f165403b;

        /* renamed from: c */
        public final ShortVideoContext f165404c;

        /* renamed from: d */
        public final int f165405d;

        static {
            Covode.recordClassIndex(86327);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73589b(Activity activity, C74171f fVar, ShortVideoContext shortVideoContext, int i) {
            super((byte) 0);
            C89219l.m154721d(activity, "");
            C89219l.m154721d(fVar, "");
            C89219l.m154721d(shortVideoContext, "");
            this.f165402a = activity;
            this.f165403b = fVar;
            this.f165404c = shortVideoContext;
            this.f165405d = i;
        }
    }
}
