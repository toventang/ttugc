package com.p2082ss.android.ugc.gamora.editor.p4276c;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.p2082ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.c.b */
public abstract class AbstractC82074b<RETURN_VALUE> {
    static {
        Covode.recordClassIndex(95898);
    }

    private AbstractC82074b() {
    }

    public /* synthetic */ AbstractC82074b(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.c.b$a */
    public static final class C82075a extends AbstractC82074b<C89391z> {

        /* renamed from: a */
        public final Activity f183648a;

        static {
            Covode.recordClassIndex(95899);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82075a(Activity activity) {
            super((byte) 0);
            C89219l.m154721d(activity, "");
            this.f183648a = activity;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.c.b$d */
    public static final class C82078d extends AbstractC82074b<C89391z> {

        /* renamed from: a */
        public final Activity f183656a;

        /* renamed from: b */
        public final RetakeVideoContext f183657b;

        static {
            Covode.recordClassIndex(95902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82078d(Activity activity, RetakeVideoContext retakeVideoContext) {
            super((byte) 0);
            C89219l.m154721d(activity, "");
            C89219l.m154721d(retakeVideoContext, "");
            this.f183656a = activity;
            this.f183657b = retakeVideoContext;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.c.b$b */
    public static final class C82076b extends AbstractC82074b<C89391z> {

        /* renamed from: a */
        public final VideoPublishEditModel f183649a;

        /* renamed from: b */
        public final AbstractC89172b<String, C89391z> f183650b;

        /* renamed from: c */
        public final AbstractC89183m<String, DraftSaveResult, C89391z> f183651c;

        static {
            Covode.recordClassIndex(95900);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.String, h.z> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.m<? super java.lang.String, ? super com.ss.android.ugc.aweme.draft.model.DraftSaveResult, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82076b(VideoPublishEditModel videoPublishEditModel, AbstractC89172b<? super String, C89391z> bVar, AbstractC89183m<? super String, ? super DraftSaveResult, C89391z> mVar) {
            super((byte) 0);
            C89219l.m154721d(videoPublishEditModel, "");
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(mVar, "");
            this.f183649a = videoPublishEditModel;
            this.f183650b = bVar;
            this.f183651c = mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.c.b$e */
    public static final class C82079e extends AbstractC82074b<C89391z> {

        /* renamed from: a */
        public final Activity f183658a;

        /* renamed from: b */
        public final Intent f183659b;

        /* renamed from: c */
        public final VideoPublishEditModel f183660c;

        static {
            Covode.recordClassIndex(95903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82079e(Activity activity, Intent intent, VideoPublishEditModel videoPublishEditModel) {
            super((byte) 0);
            C89219l.m154721d(activity, "");
            C89219l.m154721d(intent, "");
            C89219l.m154721d(videoPublishEditModel, "");
            this.f183658a = activity;
            this.f183659b = intent;
            this.f183660c = videoPublishEditModel;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.c.b$c */
    public static final class C82077c extends AbstractC82074b<Intent> {

        /* renamed from: a */
        public final boolean f183652a;

        /* renamed from: b */
        public final boolean f183653b;

        /* renamed from: c */
        public final Activity f183654c;

        /* renamed from: d */
        public final Intent f183655d;

        static {
            Covode.recordClassIndex(95901);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82077c(boolean z, boolean z2, Activity activity, Intent intent) {
            super((byte) 0);
            C89219l.m154721d(activity, "");
            C89219l.m154721d(intent, "");
            this.f183652a = z;
            this.f183653b = z2;
            this.f183654c = activity;
            this.f183655d = intent;
        }
    }
}
