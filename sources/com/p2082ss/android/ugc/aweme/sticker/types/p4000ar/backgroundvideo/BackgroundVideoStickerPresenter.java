package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.mediachoose.C59179f;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.sticker.C75456p;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75403e;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.FragmentC75458b;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3979b.AbstractC75615a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4002b.C75998a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76017a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76018b;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76019c;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4005e.C76025d;
import com.p2082ss.android.ugc.aweme.sticker.types.p4009e.AbstractC76055a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter */
public final class BackgroundVideoStickerPresenter extends AbstractC75614b implements AbstractC33974au, AbstractC75498c, AbstractC75576l {

    /* renamed from: p */
    public static final C75913a f170504p = new C75913a((byte) 0);

    /* renamed from: a */
    public String f170505a;

    /* renamed from: b */
    C76025d f170506b;

    /* renamed from: c */
    public Effect f170507c;

    /* renamed from: d */
    final List<String> f170508d;

    /* renamed from: e */
    public int f170509e;

    /* renamed from: f */
    public final ActivityC0945e f170510f;

    /* renamed from: g */
    public final String f170511g;

    /* renamed from: h */
    final AbstractC84919c f170512h;

    /* renamed from: i */
    public final AbstractC27255q<AbstractC75934f> f170513i;

    /* renamed from: j */
    public final AbstractC75937i f170514j;

    /* renamed from: k */
    public final AbstractC75935g f170515k;

    /* renamed from: l */
    public final AbstractC75936h f170516l;

    /* renamed from: m */
    final AbstractC75403e f170517m;

    /* renamed from: n */
    public final AbstractC76055a f170518n;

    /* renamed from: o */
    public final AbstractC89172b<Integer, C89391z> f170519o;

    /* renamed from: q */
    private boolean f170520q;

    /* renamed from: r */
    private final AbstractC89244h f170521r;

    /* renamed from: s */
    private final AbstractC75655o f170522s = null;

    /* renamed from: t */
    private final AbstractC76018b f170523t;

    /* renamed from: u */
    private final AbstractC75615a f170524u;

    static {
        Covode.recordClassIndex(88853);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: b */
    public final void mo23177b(AbstractC75576l.EnumC75577a aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    public final void cD_() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final AbstractC84918b mo119573e() {
        return (AbstractC84918b) this.f170521r.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter$a */
    public static final class C75913a {
        static {
            Covode.recordClassIndex(88854);
        }

        private C75913a() {
        }

        public /* synthetic */ C75913a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m133122a(Effect effect) {
            C89219l.m154721d(effect, "");
            String sdkExtra = effect.getSdkExtra();
            if (sdkExtra == null) {
                return null;
            }
            try {
                return new JSONObject(sdkExtra).optJSONObject("vl").optString("imgK");
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c
    /* renamed from: b */
    public final boolean mo118933b() {
        return this.f170520q;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter$b */
    static final class C75914b extends AbstractC89220m implements AbstractC89171a<C759151> {

        /* renamed from: a */
        final /* synthetic */ BackgroundVideoStickerPresenter f170525a;

        static {
            Covode.recordClassIndex(88855);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75914b(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter) {
            super(0);
            this.f170525a = backgroundVideoStickerPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C759151 invoke() {
            return new AbstractC84918b(this) {
                /* class com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.BackgroundVideoStickerPresenter.C75914b.C759151 */

                /* renamed from: a */
                final /* synthetic */ C75914b f170526a;

                static {
                    Covode.recordClassIndex(88856);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f170526a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter$b$1$a */
                static final /* synthetic */ class C75916a extends C89217j implements AbstractC89172b<Intent, C75924a> {
                    static {
                        Covode.recordClassIndex(88857);
                    }

                    C75916a(AbstractC75935g gVar) {
                        super(1, gVar, AbstractC75935g.class, "handleResponse", "handleResponse(Landroid/content/Intent;)Lcom/ss/android/ugc/aweme/sticker/types/ar/backgroundvideo/BackgroundMediaData;", 0);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C75924a invoke(Intent intent) {
                        Intent intent2 = intent;
                        C89219l.m154721d(intent2, "");
                        return ((AbstractC75935g) this.receiver).mo119597a(intent2);
                    }
                }

                @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b
                /* renamed from: a */
                public final boolean mo62778a(int i, int i2, Intent intent) {
                    if (i != 10002) {
                        return false;
                    }
                    this.f170526a.f170525a.mo119571a(i, i2, intent, new C75916a(this.f170526a.f170525a.f170515k));
                    return true;
                }
            };
        }
    }

    /* renamed from: f */
    private final void m133109f() {
        mo118934c();
        this.f170514j.mo119601a(new C75920d(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c
    /* renamed from: d */
    public final void mo118935d() {
        this.f170520q = false;
        C76025d dVar = this.f170506b;
        if (dVar != null) {
            dVar.mo119728b();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        this.f170513i.mo5560b().mo119592b();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter$e */
    public static final class C75921e implements AbstractC76019c {

        /* renamed from: a */
        final /* synthetic */ BackgroundVideoStickerPresenter f170530a;

        static {
            Covode.recordClassIndex(88862);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76019c
        /* renamed from: a */
        public final void mo119578a(List<C75938j> list) {
            C89219l.m154721d(list, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76019c
        /* renamed from: c */
        public final void mo119580c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76019c
        /* renamed from: a */
        public final void mo119576a() {
            this.f170530a.f170505a = "";
            Effect effect = this.f170530a.f170507c;
            if (effect != null) {
                this.f170530a.f170513i.mo5560b().mo119588a(effect);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r1 != null) goto L_0x0023;
         */
        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76019c
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo119579b() {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter r4 = r5.f170530a
                com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.g r0 = r4.f170515k
                android.os.Bundle r2 = r0.mo119596a()
                com.ss.android.ugc.aweme.sticker.q r1 = com.p2082ss.android.ugc.aweme.sticker.C75456p.m132325a()
                androidx.fragment.app.e r0 = r4.f170510f
                r3 = 10002(0x2712, float:1.4016E-41)
                android.content.Intent r2 = r1.mo62206a(r0, r2, r3)
                com.ss.android.ugc.tools.view.a.c r1 = r4.f170512h
                if (r1 != 0) goto L_0x0023
                androidx.fragment.app.e r1 = r4.f170510f
                boolean r0 = r1 instanceof com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
                if (r0 != 0) goto L_0x001f
                r1 = 0
            L_0x001f:
                com.ss.android.ugc.tools.view.a.c r1 = (com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c) r1
                if (r1 == 0) goto L_0x0031
            L_0x0023:
                com.ss.android.ugc.tools.view.a.b r0 = r4.mo119573e()
                r1.mo87534b(r0)
                com.ss.android.ugc.tools.view.a.b r0 = r4.mo119573e()
                r1.mo87532a(r0)
            L_0x0031:
                androidx.fragment.app.e r0 = r4.f170510f
                r0.startActivityForResult(r2, r3)
                com.ss.android.ugc.aweme.sticker.k.e r0 = r4.f170517m
                if (r0 == 0) goto L_0x003d
                r0.mo118948a()
            L_0x003d:
                com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter r0 = r5.f170530a
                r1 = 1
                r0.f170509e = r1
                com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter r0 = r5.f170530a
                r0.mo119572a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.BackgroundVideoStickerPresenter.C75921e.mo119579b():void");
        }

        C75921e(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter) {
            this.f170530a = backgroundVideoStickerPresenter;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76019c
        /* renamed from: a */
        public final void mo119577a(final C75998a aVar, final AbstractC76017a aVar2) {
            if (aVar != null) {
                AbstractC76055a aVar3 = this.f170530a.f170518n;
                MediaModel mediaModel = new MediaModel(-1);
                mediaModel.f134662b = aVar.f170741b;
                mediaModel.f134664d = aVar.f170754o;
                mediaModel.f134672l = aVar.f170752m;
                mediaModel.f134673m = aVar.f170753n;
                mediaModel.f134668h = aVar.f170747h;
                mediaModel.f134670j = aVar.f170755p;
                aVar3.mo119777a(mediaModel, new AbstractC89172b<C59179f, C89391z>() {
                    /* class com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.BackgroundVideoStickerPresenter.C75921e.C759221 */

                    static {
                        Covode.recordClassIndex(88863);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C59179f fVar) {
                        C89219l.m154721d(fVar, "");
                        AbstractC76017a aVar = aVar2;
                        if (aVar != null) {
                            aVar.mo119696a();
                        }
                        String str = aVar.f170741b;
                        if (str != null) {
                            BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = this.f170530a;
                            backgroundVideoStickerPresenter.f170513i.mo5560b().mo119590a(str, new C75917c(backgroundVideoStickerPresenter, str));
                            this.f170530a.f170509e = 0;
                            this.f170530a.mo119572a(true);
                        }
                        return C89391z.f203057a;
                    }
                }, new AbstractC89172b<C59179f, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.BackgroundVideoStickerPresenter.C75921e.C759232 */

                    /* renamed from: a */
                    final /* synthetic */ C75921e f170534a;

                    static {
                        Covode.recordClassIndex(88864);
                    }

                    {
                        this.f170534a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C59179f fVar) {
                        C59179f fVar2 = fVar;
                        C89219l.m154721d(fVar2, "");
                        AbstractC89172b<Integer, C89391z> bVar = this.f170534a.f170530a.f170519o;
                        if (bVar != null) {
                            bVar.invoke(Integer.valueOf(fVar2.f134659e));
                        }
                        return C89391z.f203057a;
                    }
                });
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23210a() {
        this.f170507c = null;
        this.f170505a = "";
        this.f170513i.mo5560b().mo119593c();
        C76025d dVar = this.f170506b;
        if (dVar != null) {
            dVar.f170813d.mo119690d();
        }
        mo118935d();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        AbstractC84919c cVar = this.f170512h;
        if (cVar == null) {
            ActivityC0945e eVar = this.f170510f;
            if (!(eVar instanceof AbstractC84919c)) {
                eVar = null;
            }
            cVar = (AbstractC84919c) eVar;
            if (cVar == null) {
                return;
            }
        }
        cVar.mo87534b(mo119573e());
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c
    /* renamed from: c */
    public final void mo118934c() {
        C76025d dVar;
        AbstractC75655o oVar = this.f170522s;
        if ((oVar == null || C89219l.m154714a(oVar.mo119294f(), this.f170507c)) && (dVar = this.f170506b) != null) {
            this.f170520q = true;
            C76025d.m133305a(dVar, null, 3);
            if (true ^ this.f170508d.isEmpty()) {
                dVar.mo119733g();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter$c */
    static final class C75917c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ BackgroundVideoStickerPresenter f170527a;

        /* renamed from: b */
        final /* synthetic */ String f170528b;

        static {
            Covode.recordClassIndex(88858);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75917c(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter, String str) {
            super(0);
            this.f170527a = backgroundVideoStickerPresenter;
            this.f170528b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Intent a = this.f170527a.f170516l.mo119598a(this.f170528b);
            this.f170527a.f170514j.mo119600a();
            ActivityC0945e eVar = this.f170527a.f170510f;
            Intent a2 = C75456p.m132325a().mo62205a(this.f170527a.f170510f, a);
            C759181 r6 = new AbstractC89187q<Integer, Integer, Intent, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.BackgroundVideoStickerPresenter.C75917c.C759181 */

                /* renamed from: a */
                final /* synthetic */ C75917c f170529a;

                static {
                    Covode.recordClassIndex(88859);
                }

                {
                    this.f170529a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89187q
                public final /* synthetic */ C89391z invoke(Integer num, Integer num2, Intent intent) {
                    this.f170529a.f170527a.mo119571a(num.intValue(), num2.intValue(), intent, new AbstractC89172b<Intent, C75924a>(this.f170529a.f170527a.f170516l) {
                        /* class com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.BackgroundVideoStickerPresenter.C75917c.C759181.C759191 */

                        static {
                            Covode.recordClassIndex(88860);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C75924a invoke(Intent intent) {
                            Intent intent2 = intent;
                            C89219l.m154721d(intent2, "");
                            return ((AbstractC75936h) this.receiver).mo119599a(intent2);
                        }
                    });
                    return C89391z.f203057a;
                }
            };
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(a2, "");
            C89219l.m154721d(r6, "");
            Fragment findFragmentByTag = eVar.getFragmentManager().findFragmentByTag("async_task");
            C89219l.m154721d(a2, "");
            C89219l.m154721d(r6, "");
            FragmentC75458b bVar = new FragmentC75458b();
            bVar.f169564a = a2;
            Bundle bundle = new Bundle();
            bundle.putInt("extra_request_code", 10002);
            bVar.setArguments(bundle);
            bVar.f169565b = r6;
            if (findFragmentByTag != null) {
                eVar.getFragmentManager().beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
            }
            eVar.getFragmentManager().beginTransaction().add(bVar, "async_task").commitAllowingStateLoss();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final boolean mo23213a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        return C75466g.m132354f(aVar.f170022a);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23175a(View view) {
        C89219l.m154721d(view, "");
        ViewStubCompat viewStubCompat = (ViewStubCompat) view.findViewById(R.id.e_p);
        if (viewStubCompat != null) {
            this.f170506b = new C76025d(viewStubCompat, this.f170510f, new C75921e(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23176a(AbstractC75576l.EnumC75577a aVar) {
        C89219l.m154721d(aVar, "");
        if (aVar == AbstractC75576l.EnumC75577a.AFTER_ANIMATE && this.f170507c != null && !this.f170520q) {
            m133109f();
        }
    }

    /* renamed from: a */
    public final void mo119572a(boolean z) {
        String str;
        if (this.f170509e == 0) {
            str = "video";
        } else {
            str = "album";
        }
        if (z) {
            Effect effect = this.f170507c;
            if (effect != null) {
                this.f170524u.mo118957a(effect, "upload", FaceStickerBean.sCurPropSource, str);
                return;
            }
            return;
        }
        Effect effect2 = this.f170507c;
        if (effect2 != null) {
            this.f170524u.mo118958b(effect2, "upload", FaceStickerBean.sCurPropSource, str);
        }
        this.f170509e = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter$d */
    public static final /* synthetic */ class C75920d extends C89217j implements AbstractC89183m<Boolean, List<? extends MediaModel>, C89391z> {
        static {
            Covode.recordClassIndex(88861);
        }

        C75920d(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter) {
            super(2, backgroundVideoStickerPresenter, BackgroundVideoStickerPresenter.class, "onMediaPageLoaded", "onMediaPageLoaded(ZLjava/util/List;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Boolean bool, List<? extends MediaModel> list) {
            ArrayList arrayList;
            boolean booleanValue = bool.booleanValue();
            List<? extends MediaModel> list2 = list;
            BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = (BackgroundVideoStickerPresenter) this.receiver;
            backgroundVideoStickerPresenter.f170508d.clear();
            if (booleanValue) {
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                    for (T t : list2) {
                        List<String> list3 = backgroundVideoStickerPresenter.f170508d;
                        String str = t.f134662b;
                        C89219l.m154716b(str, "");
                        list3.add(str);
                        String str2 = t.f134662b;
                        C89219l.m154716b(str2, "");
                        C75998a aVar = new C75998a(str2, t.f134668h);
                        aVar.f170748i = 2;
                        aVar.f170754o = t.f134664d;
                        aVar.f170752m = t.f134672l;
                        aVar.f170753n = t.f134673m;
                        aVar.f170755p = t.f134670j;
                        arrayList2.add(aVar);
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = C89086z.INSTANCE;
                }
                C76025d dVar = backgroundVideoStickerPresenter.f170506b;
                if (dVar != null) {
                    dVar.mo119731e();
                    dVar.mo119727a(arrayList);
                    String str3 = backgroundVideoStickerPresenter.f170505a;
                    if (str3.length() > 0 && str3 != null) {
                        dVar.mo119726a(str3);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.mo119729c();
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23212a(C75619b bVar, C75618a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        if (!C89219l.m154714a(this.f170507c, aVar.f170022a)) {
            this.f170505a = "";
            this.f170507c = aVar.f170022a;
        }
        m133109f();
        this.f170513i.mo5560b().mo119588a(aVar.f170022a);
    }

    /* renamed from: a */
    public final void mo119571a(int i, int i2, Intent intent, AbstractC89172b<? super Intent, C75924a> bVar) {
        if (i == 10002) {
            AbstractC75403e eVar = this.f170517m;
            if (eVar != null) {
                eVar.mo118949b();
            }
            if (i2 == -1 && intent != null) {
                C75924a invoke = bVar.invoke(intent);
                String str = invoke.f170536a;
                String str2 = invoke.f170537b;
                String str3 = invoke.f170538c;
                if (str3 != null) {
                    this.f170505a = str3;
                }
                if (str != null) {
                    if (str2 != null) {
                        this.f170513i.mo5560b().mo119591a(str, str2);
                    }
                    this.f170523t.mo119718a(str);
                }
            }
            this.f170513i.mo5560b().mo119587a();
            if (this.f170508d.contains(this.f170505a)) {
                C76025d dVar = this.f170506b;
                if (dVar != null) {
                    dVar.mo119726a(this.f170505a);
                }
            } else {
                C76025d dVar2 = this.f170506b;
                if (dVar2 != null) {
                    dVar2.f170813d.mo119690d();
                }
            }
            mo119572a(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public BackgroundVideoStickerPresenter(ActivityC0945e eVar, String str, AbstractC84919c cVar, AbstractC27255q<AbstractC75934f> qVar, AbstractC76018b bVar, AbstractC75615a aVar, AbstractC75937i iVar, AbstractC75935g gVar, AbstractC75936h hVar, AbstractC75403e eVar2, AbstractC76055a aVar2, AbstractC89172b<? super Integer, C89391z> bVar2) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(aVar2, "");
        this.f170510f = eVar;
        this.f170511g = str;
        this.f170512h = cVar;
        this.f170513i = qVar;
        this.f170523t = bVar;
        this.f170524u = aVar;
        this.f170514j = iVar;
        this.f170515k = gVar;
        this.f170516l = hVar;
        this.f170517m = eVar2;
        this.f170518n = aVar2;
        this.f170519o = bVar2;
        this.f170505a = "";
        this.f170508d = new ArrayList();
        this.f170521r = C89250i.m154773a((AbstractC89171a) new C75914b(this));
        eVar.getLifecycle().mo4012a(this);
    }
}
