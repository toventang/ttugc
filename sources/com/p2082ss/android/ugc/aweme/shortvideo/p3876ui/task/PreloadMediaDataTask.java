package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59174d;
import com.p2082ss.android.ugc.aweme.mediachoose.p3436a.C59148c;
import com.p2082ss.android.ugc.aweme.mediachoose.p3436a.C59154d;
import com.p2082ss.android.ugc.aweme.mediachoose.p3436a.C59155e;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68085a;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68107n;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadMediaDataTask */
public final class PreloadMediaDataTask implements AbstractC33974au, AbstractC73799a {

    /* renamed from: a */
    final ActivityC0945e f165678a;

    /* renamed from: b */
    public long f165679b;

    /* renamed from: c */
    private AbstractC88412b f165680c;

    /* renamed from: d */
    private AbstractC88412b f165681d;

    /* renamed from: e */
    private final AbstractC1196i f165682e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadMediaDataTask$b */
    static final class C73796b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C73796b f165684a = new C73796b();

        static {
            Covode.recordClassIndex(86538);
        }

        C73796b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadMediaDataTask$c */
    static final class C73797c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C73797c f165685a = new C73797c();

        static {
            Covode.recordClassIndex(86539);
        }

        C73797c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadMediaDataTask$d */
    static final class C73798d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C73798d f165686a = new C73798d();

        static {
            Covode.recordClassIndex(86540);
        }

        C73798d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(86536);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: b */
    public final boolean mo88344b() {
        if (C68107n.m120398a() || C68085a.m120387a() == 1) {
            return true;
        }
        return false;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        AbstractC88412b bVar = this.f165680c;
        if (bVar != null) {
            bVar.dispose();
        }
        AbstractC88412b bVar2 = this.f165681d;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        C59148c.C59151a.m108660a().f134583b.mo33461c();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: a */
    public final void mo88343a() {
        C59148c a = C59148c.C59151a.m108660a();
        this.f165680c = a.mo96653a(new C59155e(3, 30, 0), AbstractC59174d.C59175a.f134652a).mo143254a(new C73795a(this), C73796b.f165684a);
        this.f165681d = a.mo96653a(new C59155e(4, 30, 0), AbstractC59174d.C59175a.f134652a).mo143254a(C73797c.f165685a, C73798d.f165686a);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadMediaDataTask$a */
    static final class C73795a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ PreloadMediaDataTask f165683a;

        static {
            Covode.recordClassIndex(86537);
        }

        C73795a(PreloadMediaDataTask preloadMediaDataTask) {
            this.f165683a = preloadMediaDataTask;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C59154d dVar = (C59154d) obj;
            PreloadMediaDataTask preloadMediaDataTask = this.f165683a;
            C89219l.m154716b(dVar, "");
            if (!dVar.f134592b.isEmpty()) {
                C59154d dVar2 = C59154d.m108662a(dVar.f134591a, C89070n.m154524c(dVar.f134592b.get(0)));
                C89219l.m154721d(dVar2, "");
                ((FirstPhotoViewModel) C1181ae.m3881a(preloadMediaDataTask.f165678a, (C1175ad.AbstractC1177b) null).mo3983a(FirstPhotoViewModel.class)).f165677a.setValue(dVar2);
            }
            if (preloadMediaDataTask.f165679b != -1) {
                C39162r.m79460a("tool_performance_operation_cost_time", new C84425b().mo129406a(StringSet.type, "tool_performance_show_album_icon").mo129404a("totaltime", System.currentTimeMillis() - preloadMediaDataTask.f165679b).f188764a);
                preloadMediaDataTask.f165679b = -1;
            }
        }
    }

    public PreloadMediaDataTask(AbstractC1196i iVar, ActivityC0945e eVar, long j) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(eVar, "");
        this.f165682e = iVar;
        this.f165678a = eVar;
        this.f165679b = j;
        iVar.mo4012a(this);
    }
}
