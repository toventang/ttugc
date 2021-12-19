package com.p2082ss.android.ugc.aweme.share.silent;

import android.app.Activity;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.improve.C68963a;
import com.p2082ss.android.ugc.aweme.share.model.C69331c;
import com.p2082ss.android.ugc.aweme.share.silent.C69471s;
import com.p2082ss.android.ugc.aweme.share.silent.p3774a.AbstractC69431a;
import com.p2082ss.android.ugc.aweme.share.silent.p3774a.C69432b;
import com.p2082ss.android.ugc.aweme.share.silent.p3774a.C69434c;
import com.p2082ss.android.ugc.aweme.share.silent.p3774a.C69435d;
import com.p2082ss.android.ugc.aweme.share.silent.p3774a.C69436e;
import com.p2082ss.android.ugc.aweme.share.silent.p3774a.C69437f;
import com.p2082ss.android.ugc.aweme.share.silent.p3774a.C69438g;
import com.p2082ss.android.ugc.aweme.share.silent.p3774a.C69440h;
import com.p2082ss.android.ugc.aweme.share.silent.p3774a.C69442i;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71900f;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.share.silent.e */
public final class C69453e {

    /* renamed from: a */
    public static boolean f155156a;

    /* renamed from: b */
    public static final C69454a f155157b = new C69454a((byte) 0);

    static {
        Covode.recordClassIndex(81791);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.silent.e$a */
    public static final class C69454a {
        static {
            Covode.recordClassIndex(81792);
        }

        private C69454a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.share.silent.e$a$a */
        public static final class C69455a implements PopupWindow.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ C71900f f155158a;

            /* renamed from: b */
            final /* synthetic */ EnumC69448c f155159b;

            /* renamed from: c */
            final /* synthetic */ AVUploadSaveModel f155160c;

            /* renamed from: d */
            final /* synthetic */ Activity f155161d;

            static {
                Covode.recordClassIndex(81793);
            }

            public C69455a(C71900f fVar, EnumC69448c cVar, AVUploadSaveModel aVUploadSaveModel, Activity activity) {
                this.f155158a = fVar;
                this.f155159b = cVar;
                this.f155160c = aVUploadSaveModel;
                this.f155161d = activity;
            }

            public final void onDismiss() {
                AbstractC69431a eVar;
                C69831ai aiVar = this.f155158a.f161094h;
                Objects.requireNonNull(aiVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse");
                Aweme aweme = ((CreateAwemeResponse) aiVar).aweme;
                C89219l.m154716b(aweme, "");
                EnumC69448c cVar = this.f155159b;
                String str = this.f155160c.getLocalFinalPath().toString();
                Activity activity = this.f155161d;
                C89219l.m154721d(aweme, "");
                C89219l.m154721d(cVar, "");
                C89219l.m154721d(str, "");
                C89219l.m154721d(activity, "");
                AbstractC69581b a = C68963a.C68964a.m121652a(cVar.getKey(), activity);
                if (a != null) {
                    C89233z.C89238e eVar2 = new C89233z.C89238e();
                    eVar2.element = "";
                    C89219l.m154721d(cVar, "");
                    C89219l.m154721d(a, "");
                    switch (C69435d.f155114a[cVar.ordinal()]) {
                        case 1:
                            eVar = new C69436e(a);
                            break;
                        case 2:
                            eVar = new C69437f(a);
                            break;
                        case 3:
                            eVar = new C69442i(a);
                            break;
                        case 4:
                            eVar = new C69438g(a);
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            eVar = new C69434c(a);
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            eVar = new C69440h(a);
                            break;
                        default:
                            eVar = new C69432b(a);
                            break;
                    }
                    eVar.mo109696a(activity, str, new C69331c(cVar, "", eVar2.element, aweme), new C69471s.C69472a.C69476d(eVar2));
                }
            }
        }

        public /* synthetic */ C69454a(byte b) {
            this();
        }
    }
}
