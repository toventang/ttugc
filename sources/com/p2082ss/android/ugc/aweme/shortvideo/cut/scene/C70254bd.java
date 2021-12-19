package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40886c;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40888d;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70456g;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70463h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3801b.C70418a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70436b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70437c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71025g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.C69823b;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bd */
public final class C70254bd implements AbstractC70301bw {

    /* renamed from: a */
    public final AbstractC63154aa.AbstractC63163h f157081a;

    /* renamed from: b */
    final ArrayList<C69905c> f157082b;

    /* renamed from: c */
    final Activity f157083c;

    /* renamed from: d */
    public int f157084d;

    /* renamed from: e */
    boolean f157085e;

    /* renamed from: f */
    public int f157086f;

    /* renamed from: g */
    int f157087g;

    /* renamed from: h */
    public boolean f157088h;

    /* renamed from: i */
    public AbstractC70261be f157089i;

    /* renamed from: j */
    public String f157090j;

    /* renamed from: k */
    public boolean f157091k;

    /* renamed from: l */
    C69905c f157092l;

    /* renamed from: m */
    private final C71025g f157093m = new C71025g();

    /* renamed from: n */
    private final C70260e f157094n;

    static {
        Covode.recordClassIndex(82697);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70301bw
    /* renamed from: b */
    public final AbstractC70151a mo110900b() {
        return this.f157094n;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70301bw
    /* renamed from: c */
    public final AbstractC63154aa.AbstractC63163h mo110902c() {
        return this.f157081a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bd$b */
    public static final class C70257b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70254bd f157097a;

        static {
            Covode.recordClassIndex(82700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70257b(C70254bd bdVar) {
            super(0);
            this.f157097a = bdVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC70261be beVar = this.f157097a.f157089i;
            if (beVar != null) {
                beVar.mo110912a(null, "");
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70301bw
    /* renamed from: a */
    public final C69905c mo110895a() {
        C69905c cVar = this.f157092l;
        if (cVar != null) {
            return cVar;
        }
        if (C84904k.m145909a(this.f157082b)) {
            return null;
        }
        AbstractC63154aa.AbstractC63163h hVar = this.f157081a;
        if (hVar == null) {
            C89219l.m154715b();
        }
        return m123998b(hVar.mo101596a());
    }

    /* renamed from: d */
    public final void mo110903d() {
        AbstractC70261be beVar = this.f157089i;
        if (beVar != null) {
            beVar.mo110912a(null, "");
        }
        this.f157088h = false;
        this.f157085e = false;
        AbstractC70261be beVar2 = this.f157089i;
        if (beVar2 != null) {
            beVar2.mo110909a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70301bw
    /* renamed from: e */
    public final void mo110904e() {
        List<VideoSegment> list;
        StringBuilder sb = new StringBuilder();
        AbstractC70261be beVar = this.f157089i;
        if (beVar != null) {
            list = beVar.mo110917e();
        } else {
            list = null;
        }
        int i = 0;
        if (!C84904k.m145909a(list) && !C84904k.m145909a(list)) {
            if (list == null) {
                C89219l.m154715b();
            }
            int size = list.size();
            while (i < size) {
                sb.append(list.get(i).f156710b);
                if (i < size - 1) {
                    sb.append(",");
                }
                i++;
            }
            i = size;
        }
        AbstractC70261be beVar2 = this.f157089i;
        if (beVar2 != null) {
            beVar2.mo110913b();
        }
        C70456g.f157422a.mo111022a(i, sb.toString(), new C70259d(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bd$c */
    public static final class C70258c implements AbstractC70436b {

        /* renamed from: a */
        final /* synthetic */ C70254bd f157098a;

        static {
            Covode.recordClassIndex(82701);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70258c(C70254bd bdVar) {
            this.f157098a = bdVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70436b
        /* renamed from: a */
        public final void mo110905a(C69905c cVar, boolean z) {
            if (!z) {
                this.f157098a.mo110903d();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70436b
        /* renamed from: b */
        public final void mo110906b(C69905c cVar, boolean z) {
            String str;
            AbstractC70261be beVar;
            if (z) {
                C70254bd bdVar = this.f157098a;
                if (!bdVar.f157085e || bdVar.f157086f != -1) {
                    bdVar.f157087g = bdVar.f157086f;
                    if (bdVar.f157084d == 0) {
                        bdVar.f157092l = null;
                        AbstractC63154aa.AbstractC63163h hVar = bdVar.f157081a;
                        if (hVar == null) {
                            C89219l.m154715b();
                        }
                        hVar.mo101603b(bdVar.f157081a.mo101602b());
                    } else {
                        bdVar.f157092l = cVar;
                        AbstractC63154aa.AbstractC63163h hVar2 = bdVar.f157081a;
                        if (hVar2 == null) {
                            C89219l.m154715b();
                        }
                        hVar2.mo101603b(-1);
                    }
                    if (C89219l.m154714a((Object) bdVar.f157090j, (Object) "sync_page_favorite")) {
                        str = "favorite";
                    } else {
                        str = "recommend";
                    }
                    if (bdVar.f157091k) {
                        int i = bdVar.f157086f;
                        C89219l.m154721d(str, "");
                        if (cVar != null) {
                            C39162r.m79460a("select_music", C70463h.m124284a().mo129406a("content_source", "upload").mo129406a("content_type", "sound_sync").mo129406a("music_id", cVar.getMusicId()).mo129403a("music_show_rank", i + 1).mo129406a("music_rec_type", "").mo129406a("tab_name", str).f188764a);
                        }
                        bdVar.f157091k = false;
                    }
                } else {
                    bdVar.f157092l = null;
                    ArrayList<C69905c> arrayList = bdVar.f157082b;
                    if (cVar == null) {
                        C89219l.m154715b();
                    }
                    arrayList.add(0, cVar);
                    AbstractC63154aa.AbstractC63163h hVar3 = bdVar.f157081a;
                    if (hVar3 == null) {
                        C89219l.m154715b();
                    }
                    hVar3.mo101600a(cVar);
                    bdVar.f157081a.mo101597a(bdVar.f157081a.mo101596a() + 1);
                    bdVar.f157081a.mo101603b(0);
                    if (cVar != null) {
                        if (AVCommerceServiceImpl.m102988h().mo93962a()) {
                            C70463h.m124284a().mo129406a("is_commercial", "1");
                        }
                        C39162r.m79460a("change_music", C70463h.m124284a().mo129406a("content_source", "upload").mo129406a("content_type", "sound_sync").mo129406a("music_id", cVar.getMusicId()).mo129406a("music_rec_type", "").mo129403a("creation_duration", cVar.duration).f188764a);
                    }
                    bdVar.f157087g = 0;
                }
                AbstractC70261be beVar2 = bdVar.f157089i;
                if (beVar2 != null) {
                    beVar2.mo110912a(cVar, bdVar.f157090j);
                }
                if (!(bdVar.f157086f == -1 || (beVar = bdVar.f157089i) == null)) {
                    beVar.mo110910a(bdVar.f157086f + 1);
                }
                bdVar.f157088h = false;
                bdVar.f157085e = false;
                return;
            }
            this.f157098a.mo110903d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bd$d */
    public static final class C70259d implements AbstractC70437c {

        /* renamed from: a */
        final /* synthetic */ C70254bd f157099a;

        static {
            Covode.recordClassIndex(82702);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70259d(C70254bd bdVar) {
            this.f157099a = bdVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70437c
        /* renamed from: a */
        public final void mo110907a(Exception exc) {
            AbstractC70261be beVar = this.f157099a.f157089i;
            if (beVar != null) {
                beVar.mo110915c();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70437c
        /* renamed from: a */
        public final void mo110908a(List<? extends C69905c> list) {
            if (C84904k.m145909a(list)) {
                AbstractC70261be beVar = this.f157099a.f157089i;
                if (beVar != null) {
                    beVar.mo110915c();
                    return;
                }
                return;
            }
            C70254bd bdVar = this.f157099a;
            if (list == null) {
                C89219l.m154715b();
            }
            bdVar.mo110901b(C89070n.m154585g((Collection) list));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bd$e */
    public static final class C70260e implements AbstractC70151a {

        /* renamed from: a */
        final /* synthetic */ C70254bd f157100a;

        static {
            Covode.recordClassIndex(82703);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70260e(C70254bd bdVar) {
            this.f157100a = bdVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70301bw
    /* renamed from: a */
    public final void mo110898a(AbstractC70261be beVar) {
        C89219l.m154721d(beVar, "");
        this.f157089i = beVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70301bw
    /* renamed from: a */
    public final void mo110899a(List<C69905c> list) {
        if (C84904k.m145909a(list)) {
            mo110904e();
        } else {
            mo110901b(list);
        }
    }

    /* renamed from: b */
    private final C69905c m123998b(int i) {
        if (!C84904k.m145909a(this.f157082b) && i >= 0 && i < this.f157082b.size()) {
            return this.f157082b.get(i);
        }
        return null;
    }

    public C70254bd(Context context) {
        C89219l.m154721d(context, "");
        ArrayList<C69905c> arrayList = new ArrayList<>();
        this.f157082b = arrayList;
        this.f157083c = (Activity) context;
        this.f157086f = -1;
        this.f157087g = -1;
        this.f157090j = "sync_page_recommend";
        this.f157081a = C63253l.f143623a.mo73306b().mo101532a(arrayList, new AbstractC40895j(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70254bd.C702551 */

            /* renamed from: a */
            final /* synthetic */ C70254bd f157095a;

            static {
                Covode.recordClassIndex(82698);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f157095a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j
            /* renamed from: a */
            public final void mo70092a(View view, int i) {
                C89219l.m154721d(view, "");
                if (!this.f157095a.f157088h) {
                    this.f157095a.f157091k = true;
                    this.f157095a.f157086f = i;
                    this.f157095a.mo110896a(i);
                    this.f157095a.f157090j = "sync_page_recommend";
                }
            }
        });
        this.f157094n = new C70260e(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo110897a(C69905c cVar) {
        AbstractC70261be beVar = this.f157089i;
        if (beVar != null) {
            beVar.mo110920h();
        }
        this.f157088h = true;
        C70418a.m124204a(this.f157083c, cVar, new C70258c(this));
    }

    /* renamed from: b */
    public final void mo110901b(List<C69905c> list) {
        AbstractC70261be beVar = this.f157089i;
        if (beVar != null) {
            beVar.mo110916d();
        }
        AbstractC63154aa.AbstractC63163h hVar = this.f157081a;
        if (hVar == null) {
            C89219l.m154715b();
        }
        hVar.mo101606d();
        ArrayList<C69905c> arrayList = this.f157082b;
        if (list == null) {
            C89219l.m154715b();
        }
        arrayList.addAll(list);
        this.f157081a.mo101601a(list);
        mo110896a(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bd$a */
    public static final class C70256a extends AbstractC89220m implements AbstractC89172b<C40888d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70254bd f157096a;

        static {
            Covode.recordClassIndex(82699);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70256a(C70254bd bdVar) {
            super(1);
            this.f157096a = bdVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C40888d dVar) {
            int i;
            AbstractC70261be beVar;
            C40888d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            if (dVar2.f95709c != null) {
                C70254bd bdVar = this.f157096a;
                C69905c cVar = dVar2.f95709c;
                if (cVar == null) {
                    bdVar.f157085e = false;
                } else {
                    if (!TextUtils.isEmpty(cVar.getMusicId())) {
                        int size = bdVar.f157082b.size();
                        i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            } else if (C89219l.m154714a((Object) cVar.getMusicId(), (Object) bdVar.f157082b.get(i).getMusicId())) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        C70455f.m124268a(cVar);
                        bdVar.mo110897a(cVar);
                    } else {
                        if (C69823b.m123388a(cVar.getPath(), bdVar.f157083c)) {
                            int size2 = bdVar.f157082b.size();
                            i = 0;
                            while (true) {
                                if (i >= size2) {
                                    break;
                                } else if (C89219l.m154714a((Object) cVar.getPath(), (Object) bdVar.f157082b.get(i).getPath())) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        C70455f.m124268a(cVar);
                        bdVar.mo110897a(cVar);
                    }
                    if (i != -1) {
                        if (i == bdVar.f157087g) {
                            if (!(bdVar.f157086f == -1 || (beVar = bdVar.f157089i) == null)) {
                                beVar.mo110910a(bdVar.f157086f + 1);
                            }
                            AbstractC70261be beVar2 = bdVar.f157089i;
                            if (beVar2 != null) {
                                beVar2.mo110912a(null, "");
                            }
                            bdVar.f157085e = false;
                        } else {
                            bdVar.f157086f = i;
                            bdVar.mo110896a(i);
                        }
                    }
                    C70455f.m124268a(cVar);
                    bdVar.mo110897a(cVar);
                }
            } else {
                AbstractC70261be beVar3 = this.f157096a.f157089i;
                if (beVar3 != null) {
                    beVar3.mo110912a(null, "");
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo110896a(int i) {
        if (i == -1) {
            this.f157090j = "sync_page_lib ";
            Activity activity = this.f157083c;
            C63253l.f143623a.mo73306b().mo101538a(activity, 110, C40886c.C40887a.m82356a(activity.getString(R.string.aar), 0, false, (Bundle) null, "", "", false, true, false, 512), new C70256a(this), new C70257b(this));
            AbstractC70261be beVar = this.f157089i;
            if (beVar != null) {
                beVar.mo110919g();
            }
            this.f157085e = true;
            return;
        }
        this.f157090j = "sync_page_recommend";
        C69905c b = m123998b(i);
        AbstractC63154aa.AbstractC63163h hVar = this.f157081a;
        if (hVar == null) {
            C89219l.m154715b();
        }
        if (hVar.mo101596a() != this.f157081a.mo101602b() || this.f157081a.mo101596a() != i) {
            this.f157081a.mo101598a(i, false);
            this.f157081a.mo101605c();
            AbstractC70261be beVar2 = this.f157089i;
            if (beVar2 != null) {
                beVar2.mo110918f();
            }
            mo110897a(b);
        }
    }
}
