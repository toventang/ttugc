package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35937c;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.k */
public final /* synthetic */ class C35909k implements AbstractC1729g {

    /* renamed from: a */
    private final C35899b f84756a;

    /* renamed from: b */
    private final boolean f84757b;

    /* renamed from: c */
    private final String f84758c;

    /* renamed from: d */
    private final Music f84759d;

    static {
        Covode.recordClassIndex(43149);
    }

    C35909k(C35899b bVar, boolean z, String str, Music music) {
        this.f84756a = bVar;
        this.f84757b = z;
        this.f84758c = str;
        this.f84759d = music;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        boolean z;
        C35899b bVar = this.f84756a;
        boolean z2 = this.f84757b;
        String str = this.f84758c;
        Music music = this.f84759d;
        if (iVar.mo5539b()) {
            return null;
        }
        if (iVar.mo5544c()) {
            if (!z2) {
                bVar.f84729b.mo60191a("pick_status", (Object) 1);
                return null;
            }
            bVar.f84729b.mo60191a("status_pick_load_more", (Object) 1);
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            if (!z2) {
                ArrayList arrayList = new ArrayList();
                C35888ah ahVar = (C35888ah) iVar.mo5545d();
                bVar.f84729b.mo60191a("data_banner", ahVar.f84688a);
                MusicCollectionItem musicCollectionItem = new MusicCollectionItem();
                musicCollectionItem.mcId = "recommend_mc_id";
                musicCollectionItem.mcName = bVar.f84731d.getString(R.string.f70);
                arrayList.add(new C35884ad(C35937c.m73326a(ahVar.f84690c), musicCollectionItem, 1));
                arrayList.add(new C35887ag(ahVar.f84689b));
                bVar.f84729b.mo60191a("radio_cursor", Integer.valueOf(ahVar.f84693f));
                DataCenter dataCenter = bVar.f84729b;
                if (ahVar.f84692e == 1) {
                    z = true;
                } else {
                    z = false;
                }
                dataCenter.mo60191a("show_music_radio", Boolean.valueOf(z));
                if (str == null || ahVar.f84691d == null || ahVar.f84691d.size() <= 0) {
                    if (music != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(music);
                        if (!C35899b.m73271a(arrayList2).isEmpty()) {
                            bVar.f84729b.mo60191a("data_sticker_music_from_video", (Object) true);
                            bVar.f84729b.mo60191a("data_sticker", C35899b.m73271a(arrayList2));
                        } else {
                            bVar.f84729b.mo60191a("is_busi_sticker", (Object) false);
                        }
                    }
                } else if (!C35899b.m73271a(ahVar.f84691d).isEmpty()) {
                    bVar.f84729b.mo60191a("data_sticker_music_from_video", (Object) false);
                    bVar.f84729b.mo60191a("data_sticker", C35899b.m73271a(ahVar.f84691d));
                } else {
                    bVar.f84729b.mo60191a("is_busi_sticker", (Object) false);
                }
                bVar.f84729b.mo60191a("list", arrayList);
                bVar.f84729b.mo60191a("pick_status", (Object) 0);
                return null;
            }
            C35888ah ahVar2 = (C35888ah) iVar.mo5545d();
            bVar.f84729b.mo60191a("pick_list_more", C35937c.m73326a(ahVar2.f84690c));
            bVar.f84729b.mo60191a("radio_cursor", Integer.valueOf(ahVar2.f84693f));
            return null;
        }
    }
}
