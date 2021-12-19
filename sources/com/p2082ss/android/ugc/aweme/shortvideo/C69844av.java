package com.p2082ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14189i;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14195n;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z;
import com.google.p1998c.p1999a.AbstractC27242j;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.C68703v;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70659a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71415d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71419h;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71889n;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow.C73592c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.C74305a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.tools.C78600h;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80285bz;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.runtime.C85555d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.av */
public final class C69844av implements AbstractC14195n {

    /* renamed from: a */
    ASCameraView f156075a;

    /* renamed from: b */
    ShortVideoContextViewModel f156076b;

    /* renamed from: c */
    long f156077c;

    /* renamed from: d */
    int f156078d;

    /* renamed from: e */
    int f156079e;

    /* renamed from: f */
    ActivityC0945e f156080f;

    /* renamed from: g */
    final AbstractC14209z f156081g;

    /* renamed from: h */
    final C74172g f156082h;

    /* renamed from: i */
    final ShortVideoContext f156083i;

    /* renamed from: j */
    final C73592c f156084j;

    /* renamed from: k */
    List<AbstractC14189i> f156085k = new ArrayList();

    static {
        Covode.recordClassIndex(82252);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14195n
    /* renamed from: a */
    public final void mo22921a(C78600h hVar) {
        if (this.f156076b.mo110051b()) {
            C84911q.m145928d("VideoRecordActivity hasGoNext true return");
            return;
        }
        if (!this.f156083i.f155817b.f155653i) {
            long a = C70637di.m124840a();
            if (this.f156083i.f155817b.mo109890c()) {
                a = this.f156083i.f155817b.f155646b;
            }
            if (this.f156083i.mo110022c()) {
                a = 3000;
            }
            if (this.f156083i.f155817b.mo109896h() < a) {
                if (!this.f156083i.f155817b.mo109889b() && !this.f156083i.f155817b.mo109890c()) {
                    new C79459a(this.f156080f).mo123050a(R.string.h8c).mo123053a();
                }
                if (C70659a.m124890a(this.f156083i)) {
                    new C79459a(this.f156080f).mo123050a(R.string.h8c).mo123053a();
                }
                this.f156082h.mo116656U();
                C80510gr.m139533a("record_error", "3", "is short");
                return;
            }
        }
        for (int i = 0; i < this.f156085k.size(); i++) {
            if (this.f156085k.get(i).mo22857a(hVar)) {
                C84911q.m145928d("VideoRecordActivity interceptor handle return");
                this.f156082h.mo116656U();
                return;
            }
        }
        C84911q.m145928d("VideoRecordActivity setHasGoNext true");
        this.f156076b.mo110050b(true);
        C73975b.C73976a.f166071a.start("av_video_edit", "showProgressDialog");
        this.f156077c = System.currentTimeMillis();
        if (this.f156083i.f155817b.f155665u == 1) {
            this.f156075a.mo56932c(true);
        } else if (C70659a.m124890a(this.f156083i)) {
            this.f156075a.mo56929b(this.f156083i.f155817b.f155656l);
        }
        if (C70005cr.m123611a().f156482a == null && this.f156083i.f155752M && C80285bz.m139186a(this.f156083i)) {
            this.f156075a.mo56929b(true);
        }
        if (this.f156083i.mo110022c() || this.f156083i.f155817b.mo109890c() || this.f156083i.f155817b.mo109897i()) {
            if (this.f156083i.f155817b.f155656l) {
                this.f156075a.mo56932c(false);
            } else {
                this.f156075a.mo56932c(true);
            }
        }
        C73975b.C73976a.f166071a.step("av_video_edit", "startConcat");
        this.f156081g.mo22941an();
        C74305a.C74306a aVar = new C74305a.C74306a();
        aVar.f167095a = this.f156083i.f155817b.f155652h.mo110089a().getPath();
        aVar.f167096b = this.f156083i.f155817b.f155652h.mo110091b().getPath();
        aVar.f167099e = this.f156075a.getMediaController();
        aVar.f167098d = this.f156083i.f155744E;
        aVar.f167101g = !this.f156083i.mo110022c();
        aVar.f167102h = C85555d.m147448b().mo131524a();
        aVar.f167100f = C68703v.m121138a();
        aVar.f167097c = C71889n.m126959a(this.f156080f, this.f156083i);
        aVar.mo116916a(new C69845aw(this));
        this.f156078d++;
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14195n
    /* renamed from: a */
    public final void mo22920a(AbstractC14189i iVar) {
        this.f156085k.add(iVar);
    }

    /* renamed from: a */
    public static AbstractC88979t<AbstractC27242j<C70625d>> m123415a(ShortVideoContext shortVideoContext) {
        return AbstractC88979t.m154294a(new C69852bb(shortVideoContext));
    }

    /* renamed from: b */
    public static void m123420b(ShortVideoContext shortVideoContext) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = shortVideoContext.f155817b.mo109898j().iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
            if (timeSpeedModelExtension.getBubbleTexts() != null) {
                linkedHashSet.addAll(timeSpeedModelExtension.getBubbleTexts());
            }
            if (timeSpeedModelExtension.getARTexts() != null) {
                linkedHashSet2.addAll(timeSpeedModelExtension.getARTexts());
                if (linkedHashSet.size() == 0) {
                    linkedHashSet.addAll(timeSpeedModelExtension.getARTexts());
                }
            }
        }
        shortVideoContext.f155808ar.addAll(linkedHashSet);
        shortVideoContext.f155805ao.addAll(linkedHashSet2);
    }

    /* renamed from: a */
    public static List<AVChallenge> m123416a(ArrayList<TimeSpeedModelExtension> arrayList, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C70005cr.m123611a().f156485d);
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (!C84904k.m145909a(next.getHashtag())) {
                for (AVChallenge aVChallenge : next.getHashtag()) {
                    if (TextUtils.isEmpty(aVChallenge.cid)) {
                        C84911q.m145926b("try to add challenge, but cid is null ,name:" + aVChallenge.challengeName + ",stickerId:" + aVChallenge.stickerId);
                    }
                    linkedHashSet.add(aVChallenge);
                }
            }
        }
        linkedHashSet.removeAll(Collections.singleton(null));
        if (z) {
            linkedHashSet.removeAll(C70005cr.m123611a().f156485d);
        }
        return new ArrayList(linkedHashSet);
    }

    /* renamed from: b */
    private static void m123419b(Context context, ShortVideoContext shortVideoContext) {
        Object obj;
        if (shortVideoContext.f155756Q != null && shortVideoContext.f155756Q.getSharedARMultiPlayerUserId() != null && shortVideoContext.f155756Q.getSharedARMultiPlayerUserName() != null) {
            String sharedARTelco = shortVideoContext.f155756Q.getSharedARTelco();
            if (sharedARTelco != null) {
                obj = sharedARTelco + "5G";
            } else {
                obj = "";
            }
            String sharedARMultiPlayerUserName = shortVideoContext.f155756Q.getSharedARMultiPlayerUserName();
            String string = context.getString(R.string.fsg, obj, sharedARMultiPlayerUserName);
            String sharedARMultiPlayerUserId = shortVideoContext.f155756Q.getSharedARMultiPlayerUserId();
            if (string.endsWith(sharedARMultiPlayerUserName)) {
                string = string + " ";
            }
            int indexOf = string.indexOf(sharedARMultiPlayerUserName);
            ArrayList arrayList = new ArrayList();
            arrayList.add(AVTextExtraStructHelper.createAtStruct(indexOf, sharedARMultiPlayerUserName.length() + indexOf, sharedARMultiPlayerUserId, null));
            shortVideoContext.f155748I = arrayList;
            shortVideoContext.f155745F = string;
            shortVideoContext.f155746G = string;
            shortVideoContext.f155747H = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData m123414a(com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 331
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.C69844av.m123414a(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.String):com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0181, code lost:
        if (r9 != null) goto L_0x00ea;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m123417a(android.content.Context r11, com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext r12) {
        /*
        // Method dump skipped, instructions count: 604
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.C69844av.m123417a(android.content.Context, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):void");
    }

    /* renamed from: a */
    public static EditPreviewInfo m123413a(ShortVideoContext shortVideoContext, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, String str, String str2) {
        EditPreviewInfo a;
        int i;
        DuetContext duetContext;
        if (multiEditVideoStatusRecordData == null || shortVideoContext.mo110022c()) {
            a = new C71419h().mo113031a(new EditVideoSegment(str, str2, C71413b.m126117a(str)));
        } else {
            int i2 = shortVideoContext.f155817b.f155647c;
            if (!shortVideoContext.f155817b.mo109889b() || (duetContext = shortVideoContext.f155817b.f155659o) == null || !C89219l.m154714a((Object) duetContext.f155693o, (Object) DuetContext.f155677y)) {
                i = shortVideoContext.f155817b.f155648d;
            } else {
                i = shortVideoContext.f155817b.f155648d / 2;
            }
            a = new C71415d(i2, i).mo113020a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData);
        }
        if (!(shortVideoContext.f155743D.f155846a == null || shortVideoContext.f155743D.f155846a.getVideoSegment() == null)) {
            a.getVideoList().add(0, shortVideoContext.f155743D.f155846a.getVideoSegment());
            shortVideoContext.f155743D.f155846a.setConcatVideoPath(str);
            shortVideoContext.f155743D.f155846a.setConcatAudioPath(str2);
        }
        return a;
    }

    /* renamed from: a */
    private static void m123418a(Context context, ShortVideoContext shortVideoContext, User user, String str) {
        String str2 = "@" + C71814er.m126787a(user);
        String string = context.getString(R.string.epz, str2);
        if (string.endsWith(str2)) {
            string = string + " ";
        }
        int indexOf = string.indexOf(str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(AVTextExtraStructHelper.createDuetStruct(indexOf, str2.length() + indexOf, user.getUid(), str));
        shortVideoContext.f155748I = arrayList;
        shortVideoContext.f155745F = string;
        shortVideoContext.f155746G = string;
        shortVideoContext.f155747H = true;
    }

    public C69844av(ActivityC0945e eVar, AbstractC14209z zVar, C74172g gVar, ShortVideoContext shortVideoContext, C73592c cVar) {
        this.f156080f = eVar;
        this.f156081g = zVar;
        this.f156082h = gVar;
        this.f156075a = zVar.mo22747A();
        this.f156083i = shortVideoContext;
        this.f156084j = cVar;
        this.f156076b = (ShortVideoContextViewModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
    }
}
