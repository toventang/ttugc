package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.dsl.C2551b;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.bytedance.creativex.recorder.p938a.C14117i;
import com.bytedance.creativex.recorder.sticker.panel.C14395g;
import com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.keva.Keva;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2690cr.p2702e.C40375m;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.photo.PhotoModule;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65365be;
import com.p2082ss.android.ugc.aweme.publish.C65504a;
import com.p2082ss.android.ugc.aweme.record.AbstractC66808b;
import com.p2082ss.android.ugc.aweme.record.AbstractC66809c;
import com.p2082ss.android.ugc.aweme.record.AbstractC66810d;
import com.p2082ss.android.ugc.aweme.record.AbstractC66811e;
import com.p2082ss.android.ugc.aweme.record.AbstractC66812f;
import com.p2082ss.android.ugc.aweme.servicimpl.AbstractC67954z;
import com.p2082ss.android.ugc.aweme.servicimpl.C67885aa;
import com.p2082ss.android.ugc.aweme.setting.C68034bs;
import com.p2082ss.android.ugc.aweme.setting.C68038bw;
import com.p2082ss.android.ugc.aweme.setting.CallableC68037bv;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70629db;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.beauty.C69857a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.videolength.C71528a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3804d.p3805a.C70626a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordNewActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75314e;
import com.p2082ss.android.ugc.aweme.sticker.favorite.AbstractC75361b;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.C75424c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.AbstractC75461d;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75550j;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75972r;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76196m;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76115b;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f.C77010b;
import com.p2082ss.android.ugc.aweme.story.record.C77492c;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4309a.AbstractC83955b;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4309a.C83950a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84025h;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85515j;
import java.io.File;
import java.util.Collection;
import java.util.Set;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.services.InternalRecordServiceImpl */
public final class InternalRecordServiceImpl implements AbstractC66810d {
    private final AbstractC89244h mMaxDurationResolver$delegate = C89250i.m154773a((AbstractC89171a) InternalRecordServiceImpl$mMaxDurationResolver$2.INSTANCE);

    static {
        Covode.recordClassIndex(79654);
    }

    private final InternalMaxDurationResolverImpl getMMaxDurationResolver() {
        return (InternalMaxDurationResolverImpl) this.mMaxDurationResolver$delegate.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final boolean shouldDropCurrentMusicFor3min(Object obj, ShortVideoContext shortVideoContext) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(shortVideoContext, "");
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final void cleanStoryCache() {
        C40375m.f94558c.mo69506l();
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final AbstractC22219j createLighteningFakeScene() {
        return new C77492c();
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final boolean enable3MinRecord() {
        return C70629db.m124816b();
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final AbstractC66809c getABService() {
        return new InternalRecordServiceImpl$getABService$1();
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final AbstractC66808b getAlbumService() {
        return new AlbumServiceImpl();
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final AbstractC66811e getMaxDurationResolver() {
        return getMMaxDurationResolver();
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final void requestDuetSettingPermission() {
        C1731i.m5640b(CallableC68037bv.f152398a, C1731i.f5562a).mo5532a(C68038bw.f152399a);
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final boolean getRequestDuetSettingPermission() {
        if (Keva.getRepo("DUET_SETTING_REPO").getInt("DUET_SETTING_KEY", C68034bs.f152395f) == C68034bs.f152394e) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final boolean isRecordingOrEditing() {
        Activity c = C40964c.m82474c();
        if (!(c instanceof VideoRecordNewActivity) && !(c instanceof VEVideoPublishEditActivity)) {
            return false;
        }
        return true;
    }

    /* renamed from: com_ss_android_ugc_aweme_services_InternalRecordServiceImpl_androidx_lifecycle_VScopeLancet_of */
    public static C1175ad m120110xd34507b6(ActivityC0945e eVar) {
        return C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null);
    }

    public final boolean isMusicUnavailableLongVideo(C69905c cVar) {
        return C71528a.m126415a(cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final C14117i generateBeautyComponent(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        return C69857a.m123427a(fVar, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final void initVESDK(C85515j jVar) {
        C89219l.m154721d(jVar, "");
        C63238c.m114590a(jVar);
    }

    private final int getDefaultShootMode(ShortVideoContext shortVideoContext) {
        int i = shortVideoContext.f155817b.f155645a;
        if (i == 1) {
            return shortVideoContext.f155763X;
        }
        if (i != 2) {
            return -1;
        }
        return C71833a.m126851b().shootMode;
    }

    private final int getDefaultTabRes(ShortVideoContext shortVideoContext) {
        if (!shortVideoContext.f155817b.f155664t) {
            return R.string.f7k;
        }
        if (C70629db.m124816b()) {
            return R.string.f7l;
        }
        return R.string.f7m;
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final void addStoryTempFile(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        String str2 = File.separator;
        C89219l.m154716b(str2, "");
        if (C89361p.m154876c(str, str2, false)) {
            Set<String> set = C40375m.f94557b;
            String absolutePath = new File(str).getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            set.add(absolutePath);
            return;
        }
        C40375m.f94557b.add(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final String getDefaultShootTabTag(ShortVideoContext shortVideoContext) {
        int i;
        C89219l.m154721d(shortVideoContext, "");
        if (!C16048b.m29633a().mo25421a(true, "landing_long_duration_qa_reply", false) || !shortVideoContext.mo110039o() || shortVideoContext.mo110040p()) {
            return getDefaultTag(getDefaultShootMode(shortVideoContext), shortVideoContext);
        }
        if (C70629db.m124816b()) {
            i = R.string.f7l;
        } else {
            i = R.string.f7m;
        }
        String string = C63247i.f143610a.getString(i);
        C89219l.m154716b(string, "");
        return string;
    }

    public final AbstractC76125l.C76127b assembleStickerDependencyRequired(C21582f fVar) {
        return new AbstractC76125l.C76127b(((AbstractC84089j) fVar.mo35248a(AbstractC84089j.class, (String) null)).mo23167t(), ((AbstractC84089j) fVar.mo35248a(AbstractC84089j.class, (String) null)).mo23168u(), (AbstractC75429h) fVar.mo35248a(AbstractC75429h.class, (String) null), new C75424c(), new C76196m((AbstractC84398d) fVar.mo35248a(AbstractC84398d.class, (String) null)), ((C75574j) fVar.mo35248a(C75574j.class, (String) null)).f169851m);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017  */
    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Activity findActivityInstance(java.lang.Class<? extends androidx.fragment.app.ActivityC0945e> r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
            com.ss.android.ugc.aweme.port.in.k r1 = com.p2082ss.android.ugc.aweme.port.p3561in.C63250k.C63252a.f143622a
            boolean r0 = r1.f143618f
            if (r0 == 0) goto L_0x0042
            java.util.Set<android.app.Activity> r0 = r1.f143614b
            java.util.Iterator r3 = r0.iterator()
        L_0x0011:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r2 = r3.next()
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Class r0 = r2.getClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = r5.getName()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0041
            android.content.ComponentName r0 = r2.getComponentName()
            java.lang.String r1 = r0.getClassName()
            java.lang.String r0 = r5.getName()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x0011
        L_0x0041:
            return r2
        L_0x0042:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.services.InternalRecordServiceImpl.findActivityInstance(java.lang.Class):android.app.Activity");
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final AbstractC14318d getARGestureDelegateListener(AbstractC31193a aVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(marginLayoutParams, "");
        return new C70626a(aVar, marginLayoutParams);
    }

    private final String getDefaultTag(int i, ShortVideoContext shortVideoContext) {
        int i2;
        if (i == 10) {
            i2 = R.string.f7k;
        } else if (i == 11) {
            i2 = R.string.f7m;
        } else if (i != 14) {
            i2 = getDefaultTabRes(shortVideoContext);
        } else {
            i2 = R.string.f7l;
        }
        String string = C63247i.f143610a.getString(i2);
        C89219l.m154716b(string, "");
        return string;
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final AbstractC66812f getPhotoModule(ActivityC0945e eVar, AbstractC31133a aVar, AbstractC66812f.AbstractC66813a aVar2) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        return new PhotoModule(eVar, aVar, aVar2);
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final void registerNeededObjects(ActivityC0945e eVar, C21597n nVar, ShortVideoContext shortVideoContext) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(shortVideoContext, "");
        AbstractC1174ac a = m120110xd34507b6(eVar).mo3983a(ShortVideoContextViewModel.class);
        C89219l.m154716b(a, "");
        ((ShortVideoContextViewModel) a).f155842a = shortVideoContext;
        C89219l.m154716b(nVar.mo35260a(AbstractC75461d.class, (String) null, (AbstractC21603p) new InternalRecordServiceImpl$$special$$inlined$singleton$1()), "");
        C89219l.m154716b(nVar.mo35260a(AbstractC75429h.class, (String) null, (AbstractC21603p) new C67867x98751042(this, shortVideoContext)), "");
        C89219l.m154716b(nVar.mo35260a(AbstractC75361b.class, (String) null, (AbstractC21603p) new InternalRecordServiceImpl$$special$$inlined$singleton$3()), "");
        C89219l.m154716b(nVar.mo35260a(AbstractC75550j.class, (String) null, (AbstractC21603p) new InternalRecordServiceImpl$$special$$inlined$singleton$4()), "");
        C89219l.m154716b(nVar.mo35260a(C75574j.class, (String) null, (AbstractC21603p) new InternalRecordServiceImpl$$special$$inlined$singleton$5()), "");
        C89219l.m154716b(nVar.mo35260a(AbstractC76085a.class, (String) null, (AbstractC21603p) new InternalRecordServiceImpl$$special$$inlined$singleton$6()), "");
        if (C65365be.m117061a()) {
            C89219l.m154716b(nVar.mo35260a(AbstractC76329a.class, (String) null, (AbstractC21603p) new InternalRecordServiceImpl$$special$$inlined$singleton$7()), "");
        }
        C89219l.m154716b(nVar.mo35260a(AbstractC76115b.class, (String) null, (AbstractC21603p) new C67869x98751043(this, shortVideoContext)), "");
        C89219l.m154716b(nVar.mo35260a(AbstractC83955b.class, (String) null, (AbstractC21603p) new InternalRecordServiceImpl$$special$$inlined$singleton$9()), "");
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final void attachStickerComponent(C2551b bVar, AbstractC22186b bVar2, int i, C75972r.AbstractC75974b bVar3) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        C89219l.m154721d(bVar3, "");
        C2553d dVar = new C2553d();
        AlsLogicContainer alsLogicContainer = bVar.f7720a;
        alsLogicContainer.f7696d.mo35260a(C84025h.class, (String) null, (AbstractC21603p) new InternalRecordServiceImpl$$special$$inlined$component$1(dVar));
        alsLogicContainer.mo7005a(AbstractC84089j.class, C84025h.class);
        C2553d dVar2 = new C2553d();
        AlsLogicContainer alsLogicContainer2 = bVar.f7720a;
        alsLogicContainer2.f7696d.mo35260a(C83950a.class, (String) null, (AbstractC21603p) new InternalRecordServiceImpl$$special$$inlined$component$2(dVar2));
        alsLogicContainer2.mo7005a(AbstractC75314e.class, C83950a.class);
        C2553d dVar3 = new C2553d();
        AlsLogicContainer alsLogicContainer3 = bVar.f7720a;
        alsLogicContainer3.f7696d.mo35260a(C14395g.class, (String) null, (AbstractC21603p) new C67866x6f1e9445(dVar3, bVar2, i, bVar3));
        alsLogicContainer3.mo7005a(RecordStickerPanelViewModel.class, C14395g.class);
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final void startStoryPublish(Activity activity, AbstractC31071f fVar, AbstractC72510a aVar, C65504a aVar2, Intent intent) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C77010b bVar = new C77010b(activity, fVar, aVar, aVar2);
        C1731i.m5638b((Collection<? extends C1731i<?>>) C89070n.m154516a(bVar.mo120550a())).mo5534a(new C77010b.C77019i(bVar, intent), C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66810d
    public final void photoCanvasGoNext(ActivityC0945e eVar, String str, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, boolean z, MediaModel mediaModel, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(bVar, "");
        C67885aa.m120150a(new AbstractC67954z.C67955a(eVar, str, null, shortVideoContext, faceStickerBean, z, null, mediaModel, new InternalRecordServiceImpl$photoCanvasGoNext$1(eVar, bVar)));
    }
}
