package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.internal.CrossLanguageUserExperiment;
import com.p2082ss.android.ugc.aweme.p2690cr.p2704g.C40382a;
import com.p2082ss.android.ugc.aweme.property.C65430dm;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.eventtrack.C71821b;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.p2082ss.android.ugc.aweme.shortvideo.p3834g.C71859c;
import com.p2082ss.android.ugc.aweme.shortvideo.view.C74131a;
import com.p2082ss.android.ugc.aweme.utils.C80558hx;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.a */
public final class C72557a {

    /* renamed from: a */
    public boolean f162647a;

    /* renamed from: b */
    public final ActivityC0218d f162648b;

    /* renamed from: c */
    public final CommonSettingItemStatus f162649c;

    /* renamed from: d */
    public final VideoPublishEditModel f162650d;

    /* renamed from: e */
    public final C71859c f162651e;

    /* renamed from: f */
    public final AbstractC89171a<C89391z> f162652f;

    /* renamed from: g */
    private final AbstractC89244h f162653g = C89250i.m154773a((AbstractC89171a) new C72558a(this));

    static {
        Covode.recordClassIndex(85240);
    }

    /* renamed from: a */
    public final C74131a mo114885a() {
        return (C74131a) this.f162653g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.a$a */
    static final class C72558a extends AbstractC89220m implements AbstractC89171a<C74131a> {

        /* renamed from: a */
        final /* synthetic */ C72557a f162654a;

        static {
            Covode.recordClassIndex(85241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72558a(C72557a aVar) {
            super(0);
            this.f162654a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74131a invoke() {
            return new C74131a(this.f162654a.f162648b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.a$c */
    public static final class RunnableC72562c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72557a f162658a;

        static {
            Covode.recordClassIndex(85245);
        }

        RunnableC72562c(C72557a aVar) {
            this.f162658a = aVar;
        }

        public final void run() {
            final C89233z.C89234a aVar = new C89233z.C89234a();
            aVar.element = false;
            String str = this.f162658a.f162650d.mShootWay;
            String str2 = this.f162658a.f162650d.creationId;
            C89219l.m154716b(str2, "");
            C71821b.m126812a(str, str2);
            this.f162658a.mo114885a().mo116596a(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72557a.RunnableC72562c.C725631 */

                /* renamed from: a */
                final /* synthetic */ RunnableC72562c f162659a;

                static {
                    Covode.recordClassIndex(85246);
                }

                {
                    this.f162659a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f162659a.f162658a.f162647a = true;
                    this.f162659a.f162658a.f162649c._checked.setValue(true);
                    aVar.element = true;
                    String str = this.f162659a.f162658a.f162650d.mShootWay;
                    String str2 = this.f162659a.f162658a.f162650d.creationId;
                    C89219l.m154716b(str2, "");
                    C71821b.m126813b(str, str2);
                    return C89391z.f203057a;
                }
            }, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72557a.RunnableC72562c.C725642 */

                /* renamed from: a */
                final /* synthetic */ RunnableC72562c f162661a;

                static {
                    Covode.recordClassIndex(85247);
                }

                {
                    this.f162661a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    aVar.element = false;
                    String str = this.f162661a.f162658a.f162650d.mShootWay;
                    String str2 = this.f162661a.f162658a.f162650d.creationId;
                    C89219l.m154716b(str2, "");
                    C71821b.m126814c(str, str2);
                    return C89391z.f203057a;
                }
            }, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72557a.RunnableC72562c.C725653 */

                /* renamed from: a */
                final /* synthetic */ RunnableC72562c f162663a;

                static {
                    Covode.recordClassIndex(85248);
                }

                {
                    this.f162663a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    if (!aVar.element) {
                        String str = this.f162663a.f162658a.f162650d.mShootWay;
                        String str2 = this.f162663a.f162658a.f162650d.creationId;
                        C89219l.m154716b(str2, "");
                        C71821b.m126814c(str, str2);
                    }
                    if (!this.f162663a.f162658a.f162647a) {
                        this.f162663a.f162658a.f162651e.f161037a.mo7019b(true);
                    } else {
                        C80558hx.m139642a(450, new AbstractC89171a<C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72557a.RunnableC72562c.C725653.C725661 */

                            /* renamed from: a */
                            final /* synthetic */ C725653 f162665a;

                            static {
                                Covode.recordClassIndex(85249);
                            }

                            {
                                this.f162665a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* bridge */ /* synthetic */ C89391z invoke() {
                                if (aVar.element) {
                                    this.f162665a.f162663a.f162658a.f162652f.invoke();
                                }
                                return C89391z.f203057a;
                            }
                        });
                        C80558hx.m139642a((long) InteractFirstFrameTimeOutDurationSetting.DEFAULT, new AbstractC89171a<C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72557a.RunnableC72562c.C725653.C725672 */

                            /* renamed from: a */
                            final /* synthetic */ C725653 f162666a;

                            static {
                                Covode.recordClassIndex(85250);
                            }

                            {
                                this.f162666a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* synthetic */ C89391z invoke() {
                                this.f162666a.f162663a.f162658a.f162651e.f161037a.mo7019b(true);
                                return C89391z.f203057a;
                            }
                        });
                    }
                    return C89391z.f203057a;
                }
            });
            C40382a.f94568a.storeBoolean("auto_pop_once_auto_caption_sheet", true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.a$b */
    static final class C72559b extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72557a f162655a;

        static {
            Covode.recordClassIndex(85242);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72559b(C72557a aVar) {
            super(1);
            this.f162655a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.b2e, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72557a.C72559b.C725601 */

                /* renamed from: a */
                final /* synthetic */ C72559b f162656a;

                static {
                    Covode.recordClassIndex(85243);
                }

                {
                    this.f162656a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f162656a.f162655a.f162647a = true;
                    this.f162656a.f162655a.f162649c._checked.setValue(true);
                    String str = this.f162656a.f162655a.f162650d.mShootWay;
                    String str2 = this.f162656a.f162655a.f162650d.creationId;
                    C89219l.m154716b(str2, "");
                    C71821b.m126813b(str, str2);
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.b2d, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72557a.C72559b.C725612 */

                /* renamed from: a */
                final /* synthetic */ C72559b f162657a;

                static {
                    Covode.recordClassIndex(85244);
                }

                {
                    this.f162657a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    String str = this.f162657a.f162655a.f162650d.mShootWay;
                    String str2 = this.f162657a.f162655a.f162650d.creationId;
                    C89219l.m154716b(str2, "");
                    C71821b.m126814c(str, str2);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo114886a(int i) {
        boolean z;
        boolean z2;
        if (!CrossLanguageUserExperiment.m103003c().mo93972a() || this.f162650d.hasSubtitle()) {
            this.f162649c._visibility.setValue(8);
            return;
        }
        this.f162649c._visibility.setValue(0);
        if ((!this.f162650d.hasOriginalAudio() || this.f162650d.voiceVolume == 0.0f) && !this.f162650d.hasRecord()) {
            z = false;
        } else {
            z = true;
            if (i == 0) {
                z2 = false;
                this.f162649c._alpha.setValue(Float.valueOf(1.0f));
                this.f162649c._checked.setValue(Boolean.valueOf(this.f162647a));
                if (!this.f162647a && C65430dm.m117148b() && (true ^ C40382a.f94568a.getBoolean("auto_pop_once_auto_caption_sheet", false))) {
                    this.f162651e.f161037a.mo7019b(false);
                    new Handler(Looper.getMainLooper()).post(new RunnableC72562c(this));
                }
                this.f162649c.setOnClickListener(new C72568d(this, z2, z, i));
            }
        }
        z2 = true;
        this.f162649c._alpha.setValue(Float.valueOf(0.4f));
        this.f162649c._checked.setValue(false);
        this.f162649c.setOnClickListener(new C72568d(this, z2, z, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.a$d */
    public static final class C72568d extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72557a f162667a;

        /* renamed from: b */
        final /* synthetic */ boolean f162668b;

        /* renamed from: c */
        final /* synthetic */ boolean f162669c;

        /* renamed from: d */
        final /* synthetic */ int f162670d;

        static {
            Covode.recordClassIndex(85251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72568d(C72557a aVar, boolean z, boolean z2, int i) {
            super(1);
            this.f162667a = aVar;
            this.f162668b = z;
            this.f162669c = z2;
            this.f162670d = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            boolean z;
            String str;
            if (!this.f162668b) {
                if (C65430dm.m117149c()) {
                    z = C40382a.f94568a.getBoolean("auto_caption_sheet", false);
                } else if (C65430dm.m117147a() == C65430dm.f147591a) {
                    z = false;
                } else {
                    z = C40382a.f94568a.getBoolean("auto_caption_dialog", false);
                }
                String str2 = "";
                if (z || this.f162667a.f162647a) {
                    C72557a aVar = this.f162667a;
                    aVar.f162647a = !aVar.f162647a;
                    this.f162667a.f162649c._checked.setValue(Boolean.valueOf(!C89219l.m154714a((Object) this.f162667a.f162649c._checked.getValue(), (Object) true)));
                    C72557a aVar2 = this.f162667a;
                    boolean a = C89219l.m154714a((Object) aVar2.f162649c._checked.getValue(), (Object) true);
                    C33744d a2 = new C33744d().mo59983a("enter_method", "publish");
                    if (a) {
                        str = "on";
                    } else {
                        str = "off";
                    }
                    C33744d a3 = a2.mo59983a("to_status", str);
                    String str3 = aVar2.f162650d.mShootWay;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    C39162r.m79460a("change_transl_auth_status", a3.mo59983a("shoot_way", str2).mo59983a("creation_id", aVar2.f162650d.creationId).f79943a);
                } else {
                    String str4 = this.f162667a.f162650d.mShootWay;
                    String str5 = this.f162667a.f162650d.creationId;
                    C89219l.m154716b(str5, str2);
                    C71821b.m126812a(str4, str5);
                    if (C65430dm.m117148b()) {
                        final C89233z.C89234a aVar3 = new C89233z.C89234a();
                        aVar3.element = false;
                        this.f162667a.mo114885a().mo116596a(new AbstractC89171a<C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72557a.C72568d.C725691 */

                            /* renamed from: a */
                            final /* synthetic */ C72568d f162671a;

                            static {
                                Covode.recordClassIndex(85252);
                            }

                            {
                                this.f162671a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* synthetic */ C89391z invoke() {
                                this.f162671a.f162667a.f162647a = true;
                                this.f162671a.f162667a.f162649c._checked.setValue(true);
                                aVar3.element = true;
                                String str = this.f162671a.f162667a.f162650d.mShootWay;
                                String str2 = this.f162671a.f162667a.f162650d.creationId;
                                C89219l.m154716b(str2, "");
                                C71821b.m126813b(str, str2);
                                return C89391z.f203057a;
                            }
                        }, new AbstractC89171a<C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72557a.C72568d.C725702 */

                            /* renamed from: a */
                            final /* synthetic */ C72568d f162673a;

                            static {
                                Covode.recordClassIndex(85253);
                            }

                            {
                                this.f162673a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* synthetic */ C89391z invoke() {
                                aVar3.element = true;
                                String str = this.f162673a.f162667a.f162650d.mShootWay;
                                String str2 = this.f162673a.f162667a.f162650d.creationId;
                                C89219l.m154716b(str2, "");
                                C71821b.m126814c(str, str2);
                                return C89391z.f203057a;
                            }
                        }, new AbstractC89171a<C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.shortvideo.publish.C72557a.C72568d.C725713 */

                            /* renamed from: a */
                            final /* synthetic */ C72568d f162675a;

                            static {
                                Covode.recordClassIndex(85254);
                            }

                            {
                                this.f162675a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* synthetic */ C89391z invoke() {
                                if (!aVar3.element) {
                                    String str = this.f162675a.f162667a.f162650d.mShootWay;
                                    String str2 = this.f162675a.f162667a.f162650d.creationId;
                                    C89219l.m154716b(str2, "");
                                    C71821b.m126814c(str, str2);
                                }
                                return C89391z.f203057a;
                            }
                        });
                        if (C65430dm.m117149c()) {
                            C40382a.f94568a.storeBoolean("auto_caption_sheet", true);
                        }
                    } else {
                        C72557a aVar4 = this.f162667a;
                        ((C23023b) C23028c.m43435a((C23023b) new C23023b(aVar4.f162648b).mo37479a(R.string.b2f).mo37483b(R.string.b2a), new C72559b(aVar4)).mo37482a(false)).mo37405a().mo37396b().show();
                        C40382a.f94568a.storeBoolean("auto_caption_dialog", true);
                    }
                }
            } else if (!this.f162669c) {
                new C23144b(this.f162667a.f162648b).mo37635a(this.f162667a.f162648b.getResources().getString(R.string.b1x)).mo37637b();
            } else if (this.f162670d != 0) {
                new C23144b(this.f162667a.f162648b).mo37635a(this.f162667a.f162648b.getResources().getString(R.string.b1y)).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    public C72557a(ActivityC0218d dVar, CommonSettingItemStatus commonSettingItemStatus, VideoPublishEditModel videoPublishEditModel, C71859c cVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(commonSettingItemStatus, "");
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        this.f162648b = dVar;
        this.f162649c = commonSettingItemStatus;
        this.f162650d = videoPublishEditModel;
        this.f162651e = cVar;
        this.f162652f = aVar;
    }
}
