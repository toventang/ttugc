package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57269d;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57110d;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.e.b */
public final /* synthetic */ class C57240b implements AbstractC1729g {

    /* renamed from: a */
    private final C57238a f130388a;

    /* renamed from: b */
    private final boolean f130389b;

    /* renamed from: c */
    private final String f130390c;

    /* renamed from: d */
    private final Music f130391d;

    static {
        Covode.recordClassIndex(67145);
    }

    C57240b(C57238a aVar, boolean z, String str, Music music) {
        this.f130388a = aVar;
        this.f130389b = z;
        this.f130390c = str;
        this.f130391d = music;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        boolean z;
        C57238a aVar = this.f130388a;
        boolean z2 = this.f130389b;
        String str = this.f130390c;
        Music music = this.f130391d;
        if (iVar.mo5539b()) {
            return null;
        }
        if (iVar.mo5544c()) {
            if (!z2) {
                aVar.f130380b.mo60191a("pick_status", (Object) 1);
                return null;
            }
            aVar.f130380b.mo60191a("status_pick_load_more", (Object) 1);
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            if (!z2) {
                ArrayList arrayList = new ArrayList();
                C57256r rVar = (C57256r) iVar.mo5545d();
                aVar.f130380b.mo60191a("data_banner", rVar.f130419a);
                C57110d dVar = new C57110d();
                dVar.f130024a = "recommend_mc_id";
                dVar.f130025b = aVar.f130382d.getString(R.string.f70);
                arrayList.add(new C57252n(C57269d.m103831a(rVar.f130421c), dVar, 1));
                arrayList.add(new C57255q(rVar.f130420b));
                aVar.f130380b.mo60191a("radio_cursor", Integer.valueOf(rVar.f130424f));
                DataCenter dataCenter = aVar.f130380b;
                if (rVar.f130423e == 1) {
                    z = true;
                } else {
                    z = false;
                }
                dataCenter.mo60191a("show_music_radio", Boolean.valueOf(z));
                if (str != null && rVar.f130422d != null && rVar.f130422d.size() > 0) {
                    aVar.f130380b.mo60191a("data_sticker_music_from_video", (Object) false);
                    aVar.f130380b.mo60191a("data_sticker", rVar.f130422d);
                } else if (music != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(music);
                    aVar.f130380b.mo60191a("data_sticker_music_from_video", (Object) true);
                    aVar.f130380b.mo60191a("data_sticker", arrayList2);
                }
                aVar.f130380b.mo60191a("list", arrayList);
                aVar.f130380b.mo60191a("pick_status", (Object) 0);
                return null;
            }
            C57256r rVar2 = (C57256r) iVar.mo5545d();
            aVar.f130380b.mo60191a("pick_list_more", C57269d.m103831a(rVar2.f130421c));
            aVar.f130380b.mo60191a("radio_cursor", Integer.valueOf(rVar2.f130424f));
            return null;
        }
    }
}
