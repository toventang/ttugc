package com.p2082ss.android.ugc.aweme.servicimpl;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14189i;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14195n;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.p2316ap.C33523b;
import com.p2082ss.android.ugc.aweme.photo.PhotoModule;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65344an;
import com.p2082ss.android.ugc.aweme.record.AbstractC66812f;
import com.p2082ss.android.ugc.aweme.servicimpl.AbstractC67954z;
import com.p2082ss.android.ugc.aweme.setting.C68703v;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70659a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71889n;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.EmbaddedWindowInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow.C73592c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.C74305a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.DialogC74290k;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i;
import com.p2082ss.android.ugc.aweme.tools.C78600h;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o;
import com.p2082ss.android.ugc.aweme.utils.C80285bz;
import com.p2082ss.android.ugc.gamora.p4272a.C82004a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.runtime.C85555d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.j */
public final class C67925j implements AbstractC14195n, AbstractC66812f.AbstractC66813a {

    /* renamed from: a */
    ASCameraView f152153a;

    /* renamed from: b */
    ShortVideoContextViewModel f152154b;

    /* renamed from: c */
    long f152155c;

    /* renamed from: d */
    int f152156d;

    /* renamed from: e */
    int f152157e;

    /* renamed from: f */
    ActivityC0945e f152158f;

    /* renamed from: g */
    final AbstractC14209z f152159g;

    /* renamed from: h */
    final C74172g f152160h;

    /* renamed from: i */
    final ShortVideoContext f152161i;

    /* renamed from: j */
    final C73592c f152162j;

    /* renamed from: k */
    List<AbstractC14189i> f152163k = new ArrayList();

    /* renamed from: l */
    DialogC74290k f152164l = null;

    /* renamed from: m */
    private long f152165m = 1000;

    /* renamed from: n */
    private final AbstractC84089j f152166n;

    /* renamed from: o */
    private PhotoModule f152167o;

    /* renamed from: p */
    private C82004a f152168p;

    static {
        Covode.recordClassIndex(80094);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14195n
    /* renamed from: a */
    public final void mo22920a(AbstractC14189i iVar) {
        this.f152163k.add(iVar);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14195n
    /* renamed from: a */
    public final void mo22921a(C78600h hVar) {
        List<EmbaddedWindowInfo> list;
        if (this.f152154b.mo110051b()) {
            C84911q.m145928d("VideoRecordActivity hasGoNext true return");
            return;
        }
        boolean z = true;
        this.f152154b.mo110050b(true);
        if (this.f152161i.f155817b.f155651g < this.f152165m) {
            if (this.f152164l == null) {
                DialogC74290k kVar = new DialogC74290k(this.f152168p.f183532b);
                this.f152164l = kVar;
                kVar.setCancelable(false);
            }
            this.f152164l.show();
            if (C75346e.m132154a((AbstractC75649i) this.f152168p.f183537g.getValue()) == null) {
                z = false;
            }
            this.f152167o.mo100817a(this.f152168p.f183533c.f155817b.f155647c, this.f152168p.f183533c.f155817b.f155648d, z);
            this.f152159g.mo22753G();
            return;
        }
        for (int i = 0; i < this.f152163k.size(); i++) {
            if (this.f152163k.get(i).mo22857a(hVar)) {
                C84911q.m145928d("VideoRecordActivity interceptor handle return");
                this.f152160h.mo116656U();
                return;
            }
        }
        C84911q.m145928d("VideoRecordActivity setHasGoNext true");
        this.f152154b.mo110050b(true);
        C73975b.C73976a.f166071a.start("av_video_edit", "showProgressDialog");
        this.f152155c = System.currentTimeMillis();
        if (this.f152161i.f155817b.f155665u == 1) {
            this.f152153a.mo56932c(true);
        } else if (C70659a.m124890a(this.f152161i)) {
            this.f152153a.mo56929b(this.f152161i.f155817b.f155656l);
        }
        if (C70005cr.m123611a().f156482a == null && this.f152161i.f155752M && C80285bz.m139186a(this.f152161i)) {
            this.f152153a.mo56929b(true);
        }
        if (this.f152161i.mo110022c() || this.f152161i.f155817b.mo109890c() || this.f152161i.f155817b.mo109897i()) {
            if (this.f152161i.f155817b.f155656l) {
                this.f152153a.mo56932c(false);
            } else {
                this.f152153a.mo56932c(true);
            }
        }
        C73975b.C73976a.f166071a.step("av_video_edit", "startConcat");
        this.f152159g.mo22941an();
        C74305a.C74306a aVar = new C74305a.C74306a();
        aVar.f167095a = this.f152161i.f155817b.f155652h.mo110089a().getPath();
        aVar.f167096b = this.f152161i.f155817b.f155652h.mo110091b().getPath();
        aVar.f167099e = this.f152153a.getMediaController();
        aVar.f167098d = this.f152161i.f155744E;
        aVar.f167101g = !this.f152161i.mo110022c();
        aVar.f167102h = C85555d.m147448b().mo131524a();
        aVar.f167100f = C68703v.m121138a();
        String path = this.f152161i.f155817b.f155652h.mo110089a().getPath();
        Integer valueOf = Integer.valueOf((int) this.f152161i.f155817b.f155651g);
        Integer valueOf2 = Integer.valueOf(this.f152161i.f155817b.f155647c);
        Integer valueOf3 = Integer.valueOf(this.f152161i.f155817b.f155648d);
        if (this.f152161i.f155817b.mo109889b()) {
            list = this.f152161i.f155817b.f155659o.f155690l;
        } else {
            list = null;
        }
        aVar.f167097c = C71889n.m126960a(path, valueOf, valueOf2, valueOf3, list);
        aVar.mo116916a(new C67926k(this));
        this.f152156d++;
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66812f.AbstractC66813a
    /* renamed from: a */
    public final void mo105765a(String str, List<String> list) {
        FaceStickerBean i;
        AbstractC84089j jVar;
        ArrayList arrayList = new ArrayList();
        try {
            if (!(!C65344an.m117030a() || (jVar = this.f152166n) == null || jVar.mo128901I() == null)) {
                AbstractC78554o E = this.f152159g.mo22751E();
                AbstractC84089j jVar2 = this.f152166n;
                C89219l.m154721d(E, "");
                C89219l.m154721d(arrayList, "");
                C89219l.m154721d(jVar2, "");
                if (jVar2.mo128901I() != null) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    List<String> I = jVar2.mo128901I();
                    if (I == null) {
                        C89219l.m154715b();
                    }
                    E.mo122469a(I, new C33523b.C33524a(arrayList, countDownLatch));
                    countDownLatch.await(2, TimeUnit.SECONDS);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        ActivityC0945e eVar = this.f152158f;
        ShortVideoContext shortVideoContext = this.f152161i;
        if (this.f152168p.f183537g.getValue() == null) {
            i = null;
        } else {
            i = ((AbstractC84089j) this.f152168p.f183537g.getValue()).mo23127i();
        }
        C67885aa.m120150a(new AbstractC67954z.C67955a(eVar, str, arrayList, shortVideoContext, i, false, this.f152159g.mo22751E().mo122474e(), null, new C67934s(this)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData m120204a(com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 331
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.servicimpl.C67925j.m120204a(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.String):com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01cf, code lost:
        if (r9 != null) goto L_0x0138;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m120205a(android.content.Context r11, com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext r12) {
        /*
        // Method dump skipped, instructions count: 682
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.servicimpl.C67925j.m120205a(android.content.Context, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):void");
    }

    public C67925j(ActivityC0945e eVar, AbstractC14209z zVar, C74172g gVar, ShortVideoContext shortVideoContext, C73592c cVar, AbstractC84089j jVar, C82004a aVar) {
        this.f152158f = eVar;
        this.f152159g = zVar;
        this.f152160h = gVar;
        this.f152153a = zVar.mo22747A();
        this.f152166n = jVar;
        this.f152161i = shortVideoContext;
        this.f152162j = cVar;
        this.f152168p = aVar;
        this.f152154b = (ShortVideoContextViewModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
        this.f152167o = (PhotoModule) C63244g.m114602a().mo73284l().getPhotoModule(eVar, zVar.mo22747A().getMediaController(), this);
    }
}
