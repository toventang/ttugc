package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.AbstractC33936c;
import com.p2082ss.android.ugc.aweme.arch.C33933a;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.activity.MusicDetailListActivity;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57238a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57245g;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57268c;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.C57290n;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57110d;
import com.p2082ss.android.ugc.trill.R;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.s */
public final class C57225s extends AbstractC34586a implements C33933a.AbstractC33934a<C57110d>, AbstractC39063h.AbstractC39067a, AbstractC57233a<C57110d> {

    /* renamed from: a */
    protected DataCenter f130351a;

    /* renamed from: b */
    protected AbstractC33936c<C57110d> f130352b;

    /* renamed from: c */
    protected int f130353c;

    /* renamed from: d */
    private C57238a f130354d;

    /* renamed from: e */
    private C33933a f130355e;

    /* renamed from: j */
    private final int f130356j = 20;

    static {
        Covode.recordClassIndex(67130);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: b */
    public final String mo60169b() {
        return "music_sheet_list";
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: c */
    public final String mo60170c() {
        return "refresh_status_music_sheet";
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: d */
    public final String mo60171d() {
        return "loadmore_status_music_sheet";
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a
    /* renamed from: q */
    public final void mo94445q() {
        C57238a aVar = this.f130354d;
        if (aVar != null) {
            aVar.mo94455a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: e */
    public final DataCenter mo60172e() {
        DataCenter a = DataCenter.m69492a(C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null), this);
        this.f130351a = a;
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a
    /* renamed from: r */
    public final void mo94446r() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: a */
    public final void mo60168a() {
        C57238a aVar = new C57238a(getContext(), this.f130351a);
        this.f130354d = aVar;
        aVar.mo94455a();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        DataCenter dataCenter;
        int intValue;
        AbstractC33936c<C57110d> cVar = this.f130352b;
        if (cVar != null) {
            cVar.mo60175a();
        }
        if (this.f130354d != null && (dataCenter = this.f130351a) != null) {
            Object a = ((C33935b) dataCenter.mo60192a("music_sheet_list")).mo60174a("list_cursor");
            if (a instanceof Long) {
                intValue = ((Long) a).intValue();
            } else if (a instanceof Integer) {
                intValue = ((Integer) a).intValue();
            } else {
                return;
            }
            if (intValue > 0) {
                ChooseMusicApi.m103648b(intValue).mo5534a(new C57245g(this.f130354d), C1731i.f5564c, null);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: a */
    public final AbstractC33936c<C57110d> mo60167a(View view) {
        C57290n nVar = new C57290n(getContext(), view, this, this, this.f130353c);
        nVar.f130484a.setTitle(R.string.db7);
        this.f130352b = nVar;
        return nVar;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 1;
        if (getArguments() != null) {
            i = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.f130353c = i;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a
    /* renamed from: b */
    public final /* synthetic */ void mo94441b(C57110d dVar) {
        C57110d dVar2 = dVar;
        if (dVar2 != null && !TextUtils.isEmpty(dVar2.f130024a)) {
            Intent intent = new Intent(getContext(), MusicDetailListActivity.class);
            intent.putExtra("music_type", 2);
            intent.putExtra("music_class_id", dVar2.f130024a);
            intent.putExtra("music_class_name", dVar2.f130025b);
            intent.putExtra("music_category_is_hot", dVar2.f130028e);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.f130353c);
            intent.putExtra("music_class_enter_method", "click_category_list");
            intent.putExtra("music_class_level", dVar2.f130029f);
            startActivityForResult(intent, 10001);
            C57268c.m103829a(dVar2.f130025b, "click_category_list", "", "change_music_page_detail", dVar2.f130024a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f130355e == null) {
            this.f130355e = new C33933a(this);
        }
        this.f130355e.mo60166a(view);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.ada, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1) {
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
    }
}
