package com.p2082ss.android.ugc.aweme.shortvideo.p3789ab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.m */
public abstract class AbstractC69783m<RETURN_VALUE> {
    static {
        Covode.recordClassIndex(82189);
    }

    private AbstractC69783m() {
    }

    public /* synthetic */ AbstractC69783m(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.m$a */
    public static final class C69784a extends AbstractC69783m<C89391z> {

        /* renamed from: a */
        public final Activity f155951a;

        static {
            Covode.recordClassIndex(82190);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69784a(Activity activity) {
            super((byte) 0);
            C89219l.m154721d(activity, "");
            this.f155951a = activity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.m$b */
    public static final class C69785b extends AbstractC69783m<Intent> {

        /* renamed from: a */
        public final ActivityC0945e f155952a;

        /* renamed from: b */
        public final Bundle f155953b;

        /* renamed from: c */
        public final String f155954c;

        static {
            Covode.recordClassIndex(82191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69785b(ActivityC0945e eVar, Bundle bundle, String str) {
            super((byte) 0);
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(bundle, "");
            this.f155952a = eVar;
            this.f155953b = bundle;
            this.f155954c = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.m$c */
    public static final class C69786c extends AbstractC69783m<C89391z> {

        /* renamed from: a */
        public final C43223c f155955a;

        /* renamed from: b */
        public final int f155956b;

        /* renamed from: c */
        public final VideoPublishEditModel f155957c;

        /* renamed from: d */
        public final IDraftService.DraftSaveListener f155958d;

        static {
            Covode.recordClassIndex(82192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69786c(C43223c cVar, int i, VideoPublishEditModel videoPublishEditModel, IDraftService.DraftSaveListener draftSaveListener) {
            super((byte) 0);
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(videoPublishEditModel, "");
            C89219l.m154721d(draftSaveListener, "");
            this.f155955a = cVar;
            this.f155956b = i;
            this.f155957c = videoPublishEditModel;
            this.f155958d = draftSaveListener;
        }
    }
}
