package com.p2082ss.android.ugc.aweme.story.record.recordcontrol;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14189i;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14195n;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.p1998c.p1999a.AbstractC27242j;
import com.p2082ss.android.ugc.asve.recorder.C31217m;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.canvas.C35377f;
import com.p2082ss.android.ugc.aweme.canvas.C35379g;
import com.p2082ss.android.ugc.aweme.canvas.C35387i;
import com.p2082ss.android.ugc.aweme.canvas.C35413x;
import com.p2082ss.android.ugc.aweme.canvas.C35415y;
import com.p2082ss.android.ugc.aweme.canvas.C35416z;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2730de.C40971f;
import com.p2082ss.android.ugc.aweme.photo.C62870g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65344an;
import com.p2082ss.android.ugc.aweme.record.AbstractC66812f;
import com.p2082ss.android.ugc.aweme.shortvideo.C70640dl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71419h;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71493a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71889n;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.EmbaddedWindowInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74171f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74318j;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.C74305a;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72783c;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.story.C76738e;
import com.p2082ss.android.ugc.aweme.story.base.model.ETParams;
import com.p2082ss.android.ugc.aweme.story.base.model.EditContext;
import com.p2082ss.android.ugc.aweme.story.base.p4021b.C76615b;
import com.p2082ss.android.ugc.aweme.story.base.p4023ui.StoryEditActivity;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.p2082ss.android.ugc.aweme.story.record.p4061a.C77467b;
import com.p2082ss.android.ugc.aweme.story.record.p4064d.C77497a;
import com.p2082ss.android.ugc.aweme.story.record.p4066f.C77561a;
import com.p2082ss.android.ugc.aweme.tools.C78600h;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.VERecordData;
import com.p2082ss.android.vesdk.runtime.AbstractC85556e;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.StoryRecordNextAction */
public final class StoryRecordNextAction implements AbstractC14195n, AbstractC33974au, AbstractC66812f.AbstractC66813a {

    /* renamed from: a */
    AbstractC88412b f174070a;

    /* renamed from: b */
    public final ActivityC0945e f174071b;

    /* renamed from: c */
    public final C77467b f174072c;

    /* renamed from: d */
    public final AbstractC14330a f174073d;

    /* renamed from: e */
    public final C77561a f174074e;

    /* renamed from: f */
    public final C74171f f174075f;

    /* renamed from: g */
    final AbstractC89171a<String> f174076g;

    /* renamed from: h */
    private final int f174077h = C62870g.f142580a;

    /* renamed from: i */
    private final int f174078i = C62870g.f142581b;

    /* renamed from: j */
    private final AbstractC89244h f174079j = C89250i.m154773a((AbstractC89171a) new C77617g(this));

    /* renamed from: k */
    private StoryEditModel f174080k;

    /* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.StoryRecordNextAction$a */
    public static final class C77611a {
        static {
            Covode.recordClassIndex(90649);
        }
    }

    static {
        Covode.recordClassIndex(90648);
    }

    /* renamed from: a */
    public final AbstractC66812f mo121149a() {
        return (AbstractC66812f) this.f174079j.getValue();
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14195n
    /* renamed from: a */
    public final void mo22920a(AbstractC14189i iVar) {
        C89219l.m154721d(iVar, "");
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        AbstractC88412b bVar = this.f174070a;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        StoryEditModel storyEditModel = this.f174080k;
        if (storyEditModel != null) {
            StoryEditActivity.C76632a.m134230a(this.f174071b, storyEditModel);
            this.f174080k = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.StoryRecordNextAction$g */
    static final class C77617g extends AbstractC89220m implements AbstractC89171a<AbstractC66812f> {

        /* renamed from: a */
        final /* synthetic */ StoryRecordNextAction f174092a;

        static {
            Covode.recordClassIndex(90655);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77617g(StoryRecordNextAction storyRecordNextAction) {
            super(0);
            this.f174092a = storyRecordNextAction;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC66812f invoke() {
            return C63244g.m114602a().mo73284l().getPhotoModule(this.f174092a.f174071b, this.f174092a.f174072c.f163385s.getMediaController(), this.f174092a);
        }
    }

    /* renamed from: a */
    public final void mo121150a(StoryEditModel storyEditModel) {
        AbstractC1196i lifecycle = this.f174071b.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        if (lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.RESUMED)) {
            StoryEditActivity.C76632a.m134230a(this.f174071b, storyEditModel);
        } else {
            this.f174080k = storyEditModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.StoryRecordNextAction$e */
    static final class C77615e<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ StoryRecordNextAction f174084a;

        /* renamed from: b */
        final /* synthetic */ String f174085b;

        static {
            Covode.recordClassIndex(90653);
        }

        C77615e(StoryRecordNextAction storyRecordNextAction, String str) {
            this.f174084a = storyRecordNextAction;
            this.f174085b = str;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<AbstractC27242j<MultiEditVideoStatusRecordData>> vVar) {
            C89219l.m154721d(vVar, "");
            if (this.f174084a.f174072c.f163385s.mo56984i()) {
                C40971f.m82489a("fail to stopRecord before goNext(story quick shoot)");
            }
            vVar.mo143031a(AbstractC27242j.fromNullable(StoryRecordNextAction.m135607a(this.f174084a.f174074e, this.f174085b)));
            vVar.mo143023a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.StoryRecordNextAction$h */
    static final class C77618h<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ StoryRecordNextAction f174093a;

        /* renamed from: b */
        final /* synthetic */ int f174094b;

        static {
            Covode.recordClassIndex(90656);
        }

        C77618h(StoryRecordNextAction storyRecordNextAction, int i) {
            this.f174093a = storyRecordNextAction;
            this.f174094b = i;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<Object> vVar) {
            C89219l.m154721d(vVar, "");
            if (this.f174094b > 0) {
                ((AbstractC14330a) this.f174093a.f174072c.getDiContainer().mo35249a((Type) AbstractC14330a.class, (String) null)).mo23133o();
            }
            vVar.mo143031a(new Object());
            vVar.mo143023a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.StoryRecordNextAction$f */
    static final class C77616f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StoryRecordNextAction f174086a;

        /* renamed from: b */
        final /* synthetic */ C35387i f174087b;

        /* renamed from: c */
        final /* synthetic */ int f174088c;

        /* renamed from: d */
        final /* synthetic */ int f174089d;

        /* renamed from: e */
        final /* synthetic */ String f174090e;

        /* renamed from: f */
        final /* synthetic */ List f174091f;

        static {
            Covode.recordClassIndex(90654);
        }

        C77616f(StoryRecordNextAction storyRecordNextAction, C35387i iVar, int i, int i2, String str, List list) {
            this.f174086a = storyRecordNextAction;
            this.f174087b = iVar;
            this.f174088c = i;
            this.f174089d = i2;
            this.f174090e = str;
            this.f174091f = list;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ETParams eTParams;
            String str;
            List<String> list;
            List<String> list2;
            C35413x xVar = (C35413x) obj;
            this.f174087b.mo62288a();
            EditContext copy$default = EditContext.copy$default(this.f174086a.f174074e.mo121127f(), null, null, null, false, null, null, null, null, 0, null, null, null, null, false, 0, null, 57215, null);
            String str2 = this.f174086a.f174074e.f173950b;
            String str3 = this.f174086a.f174074e.f173951c;
            if (str3 == null) {
                str3 = "";
            }
            ETParams etParams = copy$default.getEtParams();
            if (etParams != null) {
                eTParams = ETParams.copy$default(etParams, null, null, null, this.f174086a.f174075f.f166569a.f166734b, 0, 0.0f, 55, null);
            } else {
                eTParams = null;
            }
            Effect a = C75346e.m132154a(this.f174086a.f174073d);
            if (a != null) {
                str = a.getEffectId();
            } else {
                str = null;
            }
            ExtractFramesModel d = this.f174086a.f174074e.mo121125d();
            if (C75466g.m132359k(C75346e.m132154a(this.f174086a.f174073d))) {
                list = this.f174086a.mo121149a().mo100816a();
            } else {
                list = null;
            }
            if (C75466g.m132361m(C75346e.m132154a(this.f174086a.f174073d))) {
                list2 = this.f174086a.mo121149a().mo100816a();
            } else {
                list2 = null;
            }
            StoryEditModel storyEditModel = new StoryEditModel(str2, str3, 1, false, EditContext.copy$default(copy$default, eTParams, str, d, false, null, list, list2, null, this.f174086a.f174072c.f163388v.mo115026g(), RecordScene.getCameraIdsStringByModel(this.f174086a.f174074e.f173959k.mo109898j()), C89070n.m154516a(this.f174086a.f174072c.mo22793aa()), null, null, false, 0, null, 57496, null));
            EditPreviewInfo a2 = new C71419h(this.f174088c, this.f174089d, C76615b.m134199a(this.f174086a.f174074e.mo121120a(), null), 12).mo113031a(new EditVideoSegment(this.f174090e, null, new VideoFileInfo(this.f174088c, this.f174089d, 5000, 30, 0, 0, 0, 0, 240, null)));
            StoryEditClipModel storyEditClipModel = new StoryEditClipModel(this.f174086a.f174074e.mo121120a(), a2, 11, 2, null, 16, null);
            storyEditClipModel.setAiMusicRequestTaskId(C76738e.m134317a(2, a2, this.f174086a.f174074e.mo121126e()));
            C89219l.m154716b(xVar, "");
            storyEditClipModel.setCanvasVideoData(C35379g.m72408a(xVar, this.f174091f));
            storyEditModel.add(storyEditClipModel, 0);
            this.f174086a.mo121150a(storyEditModel);
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14195n
    /* renamed from: a */
    public final void mo22921a(C78600h hVar) {
        String str;
        String str2;
        C89219l.m154721d(hVar, "");
        this.f174075f.mo116640a();
        boolean z = true;
        if (this.f174074e.f173959k.f155651g < 1000) {
            mo121149a().mo100819a(C76615b.m134199a(this.f174074e.mo121120a(), UGCMonitor.TYPE_PHOTO));
            if (C65344an.m117030a()) {
                AbstractC14330a aVar = this.f174073d;
                if ((aVar instanceof AbstractC84089j) && ((AbstractC84089j) aVar).mo128901I() != null) {
                    ArrayList arrayList = new ArrayList();
                    AbstractC78554o E = this.f174072c.mo22751E();
                    C89219l.m154716b(E, "");
                    C77497a.m135512a(E, arrayList, (AbstractC84089j) this.f174073d);
                    AbstractC66812f a = mo121149a();
                    int i = this.f174074e.f173959k.f155647c;
                    int i2 = this.f174074e.f173959k.f155648d;
                    if (C75346e.m132154a(this.f174073d) == null) {
                        z = false;
                    }
                    a.mo100818a(i, i2, z, arrayList);
                    return;
                }
            }
            AbstractC66812f a2 = mo121149a();
            int i3 = this.f174074e.f173959k.f155647c;
            int i4 = this.f174074e.f173959k.f155648d;
            if (C75346e.m132154a(this.f174073d) == null) {
                z = false;
            }
            a2.mo100817a(i3, i4, z);
            return;
        }
        this.f174072c.mo22938ak();
        C74305a.C74306a aVar2 = new C74305a.C74306a();
        File a3 = this.f174074e.mo121123b().mo110089a();
        if (a3 != null) {
            str = a3.getPath();
        } else {
            str = null;
        }
        aVar2.f167095a = str;
        File b = this.f174074e.mo121123b().mo110091b();
        if (b != null) {
            str2 = b.getPath();
        } else {
            str2 = null;
        }
        aVar2.f167096b = str2;
        aVar2.f167099e = this.f174072c.f163385s.getMediaController();
        aVar2.f167098d = false;
        aVar2.f167101g = true;
        aVar2.f167100f = C63244g.m114602a().mo73284l().getABService().getEnablePreReleaseGPUResource();
        File a4 = this.f174074e.mo121123b().mo110089a();
        C89219l.m154716b(a4, "");
        aVar2.f167097c = C71889n.m126960a(a4.getPath(), Integer.valueOf((int) this.f174074e.f173959k.f155651g), Integer.valueOf(this.f174074e.f173959k.f155647c), Integer.valueOf(this.f174074e.f173959k.f155648d), (List<EmbaddedWindowInfo>) null);
        aVar2.mo116916a(new C77612b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.StoryRecordNextAction$d */
    static final class C77614d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StoryRecordNextAction f174083a;

        static {
            Covode.recordClassIndex(90652);
        }

        C77614d(StoryRecordNextAction storyRecordNextAction) {
            this.f174083a = storyRecordNextAction;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x011f A[LOOP:0: B:23:0x0119->B:25:0x011f, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0178  */
        /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r28) {
            /*
            // Method dump skipped, instructions count: 618
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.record.recordcontrol.StoryRecordNextAction.C77614d.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.StoryRecordNextAction$c */
    static final class C77613c<T1, T2, R> implements AbstractC88430c {

        /* renamed from: a */
        public static final C77613c f174082a = new C77613c();

        static {
            Covode.recordClassIndex(90651);
        }

        C77613c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88430c
        /* renamed from: a */
        public final /* synthetic */ Object mo9210a(Object obj, Object obj2) {
            C89219l.m154721d(obj, "");
            C89219l.m154721d(obj2, "");
            return new C89378p(obj, obj2);
        }
    }

    /* renamed from: a */
    public static MultiEditVideoStatusRecordData m135607a(C77561a aVar, String str) {
        boolean z = false;
        VERecordData a = VERecordData.m146578a((AbstractC85556e) new C31217m(new C72783c(aVar.mo121123b())), false);
        if (a == null) {
            C39162r.m79460a("ve_create_record_data", new C84425b().mo129403a("status", -1).f188764a);
            C84911q.m145926b("record data == null");
            return null;
        }
        C39162r.m79460a("ve_create_record_data", new C84425b().mo129403a("status", 0).f188764a);
        File a2 = aVar.mo121123b().mo110089a();
        C89219l.m154716b(a2, "");
        a.f190796d = a2.getAbsolutePath();
        File b = aVar.mo121123b().mo110091b();
        C89219l.m154716b(b, "");
        a.f190797e = b.getAbsolutePath();
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
        File e = aVar.mo121123b().mo110096e();
        C89219l.m154716b(e, "");
        String absolutePath = e.getAbsolutePath();
        C89219l.m154716b(absolutePath, "");
        MultiEditVideoRecordData a3 = C71493a.m126270a(a, absolutePath);
        if (a3 == null) {
            return null;
        }
        List<MultiEditVideoSegmentRecordData> list = a3.segmentDataList;
        if (list != null && list.size() == 1) {
            z = true;
        }
        a3.isSingleVideo = z;
        multiEditVideoStatusRecordData.originMultiEditRecordData = a3.cloneData();
        multiEditVideoStatusRecordData.curMultiEditVideoRecordData = a3;
        multiEditVideoStatusRecordData.videoMetaData = str;
        return multiEditVideoStatusRecordData;
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66812f.AbstractC66813a
    /* renamed from: a */
    public final void mo105765a(String str, List<String> list) {
        String str2;
        C89378p a;
        C89219l.m154721d(str, "");
        this.f174072c.mo22751E().mo122472c();
        this.f174074e.mo121121a(this.f174072c.mo22751E().mo122474e());
        C77561a aVar = this.f174074e;
        if (aVar.f173959k.f155651g > 0) {
            str2 = this.f174076g.invoke();
        } else {
            str2 = "take_photo";
        }
        aVar.f173956h = str2;
        if (C35416z.f83574a) {
            a = C89387v.m154943a(Integer.valueOf(C70640dl.f158120a), Integer.valueOf(C70640dl.f158121b));
        } else {
            a = C89387v.m154943a(Integer.valueOf(C70640dl.f158122c), Integer.valueOf(C70640dl.f158123d));
        }
        int intValue = ((Number) a.component1()).intValue();
        int intValue2 = ((Number) a.component2()).intValue();
        C35387i iVar = new C35387i(true);
        iVar.f83483a = System.currentTimeMillis();
        this.f174070a = new C35377f(new C35415y(), true).mo62282a(str, intValue, intValue2, true, C76615b.m134199a(this.f174074e.mo121120a(), "canvas")).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C77616f(this, iVar, intValue, intValue2, str, list));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.StoryRecordNextAction$b */
    static final class C77612b implements AbstractC74318j {

        /* renamed from: a */
        final /* synthetic */ StoryRecordNextAction f174081a;

        static {
            Covode.recordClassIndex(90650);
        }

        C77612b(StoryRecordNextAction storyRecordNextAction) {
            this.f174081a = storyRecordNextAction;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74318j
        /* renamed from: a */
        public final void mo108517a(String str, String str2, String str3, int i) {
            C84911q.m145921a("MultiEditLog: concat statusCode".concat(String.valueOf(i)));
            C73975b.C73976a.f166071a.step("av_video_edit", "concatEnd");
            StoryRecordNextAction storyRecordNextAction = this.f174081a;
            AbstractC88979t a = AbstractC88979t.m154294a(new C77618h(storyRecordNextAction, i)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
            C89219l.m154716b(a, "");
            AbstractC88979t a2 = AbstractC88979t.m154294a(new C77615e(storyRecordNextAction, str3)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
            C89219l.m154716b(a2, "");
            storyRecordNextAction.f174070a = AbstractC88979t.m154296a(a, a2, C77613c.f174082a).mo143289d(new C77614d(storyRecordNextAction));
        }
    }

    public StoryRecordNextAction(ActivityC0945e eVar, C77467b bVar, AbstractC14330a aVar, C77561a aVar2, C74171f fVar, AbstractC89171a<String> aVar3) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar3, "");
        this.f174071b = eVar;
        this.f174072c = bVar;
        this.f174073d = aVar;
        this.f174074e = aVar2;
        this.f174075f = fVar;
        this.f174076g = aVar3;
        eVar.getLifecycle().mo4012a(this);
    }
}
