package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57108b;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.e.f */
public final /* synthetic */ class C57244f implements AbstractC1729g {

    /* renamed from: a */
    private final C57238a f130400a;

    static {
        Covode.recordClassIndex(67149);
    }

    C57244f(C57238a aVar) {
        this.f130400a = aVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C57238a aVar = this.f130400a;
        if (iVar.mo5544c()) {
            aVar.f130380b.mo60191a("refresh_status_music_sheet", (Object) 1);
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            aVar.f130380b.mo60191a("refresh_status_music_sheet", (Object) 0);
            C57108b bVar = (C57108b) iVar.mo5545d();
            C33935b bVar2 = new C33935b();
            bVar2.mo60173a("list_cursor", Long.valueOf(bVar.f130021a)).mo60173a("list_hasmore", Boolean.valueOf(bVar.f130022b)).mo60173a("action_type", 1).mo60173a("list_data", bVar.mo94259a());
            aVar.f130380b.mo60191a("music_sheet_list", bVar2);
            return null;
        }
    }
}
