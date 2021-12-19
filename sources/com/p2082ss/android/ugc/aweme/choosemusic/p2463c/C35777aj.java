package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

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
import com.p2082ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.p2082ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35899b;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35913o;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35826a;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35996y;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p2082ss.android.ugc.trill.R;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.aj */
public final class C35777aj extends AbstractC34586a implements C33933a.AbstractC33934a<MusicCollectionItem>, AbstractC35826a<MusicCollectionItem>, AbstractC39063h.AbstractC39067a {

    /* renamed from: a */
    protected DataCenter f84439a;

    /* renamed from: b */
    protected AbstractC33936c<MusicCollectionItem> f84440b;

    /* renamed from: c */
    protected int f84441c;

    /* renamed from: d */
    protected int f84442d;

    /* renamed from: e */
    private C35899b f84443e;

    /* renamed from: j */
    private C33933a f84444j;

    /* renamed from: k */
    private final int f84445k = 20;

    static {
        Covode.recordClassIndex(43016);
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

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35826a
    /* renamed from: t */
    public final void mo62849t() {
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: e */
    public final DataCenter mo60172e() {
        DataCenter a = DataCenter.m69492a(C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null), this);
        this.f84439a = a;
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35826a
    /* renamed from: u */
    public final void mo62850u() {
        C35899b bVar = this.f84443e;
        if (bVar != null) {
            bVar.mo63020a(this.f84442d);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35826a
    /* renamed from: v */
    public final void mo62851v() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: a */
    public final void mo60168a() {
        C35899b bVar = new C35899b(getContext(), this.f84439a);
        this.f84443e = bVar;
        bVar.mo63020a(this.f84442d);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        DataCenter dataCenter;
        int intValue;
        AbstractC33936c<MusicCollectionItem> cVar = this.f84440b;
        if (cVar != null) {
            cVar.mo60175a();
        }
        if (this.f84443e != null && (dataCenter = this.f84439a) != null) {
            Object a = ((C33935b) dataCenter.mo60192a("music_sheet_list")).mo60174a("list_cursor");
            if (a instanceof Long) {
                intValue = ((Long) a).intValue();
            } else if (a instanceof Integer) {
                intValue = ((Integer) a).intValue();
            } else {
                return;
            }
            if (intValue > 0) {
                ChooseMusicApi.m72935a(intValue, this.f84442d).mo5534a(new C35913o(this.f84443e), C1731i.f5564c, null);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.C33933a.AbstractC33934a
    /* renamed from: a */
    public final AbstractC33936c<MusicCollectionItem> mo60167a(View view) {
        C35996y yVar = new C35996y(getContext(), view, this, this, this.f84441c);
        yVar.f84950a.setTitle(R.string.db7);
        this.f84440b = yVar;
        return yVar;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 1;
        if (getArguments() != null) {
            i = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.f84441c = i;
        int i2 = 0;
        if (getArguments() != null) {
            i2 = getArguments().getInt("sound_page_scene", 0);
        }
        this.f84442d = i2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35826a
    /* renamed from: b */
    public final /* synthetic */ void mo62848b(MusicCollectionItem musicCollectionItem) {
        MusicCollectionItem musicCollectionItem2 = musicCollectionItem;
        if (musicCollectionItem2 != null && !TextUtils.isEmpty(musicCollectionItem2.mcId)) {
            Intent intent = new Intent(getContext(), MusicDetailListActivity.class);
            intent.putExtra("music_type", 2);
            intent.putExtra("music_class_id", musicCollectionItem2.mcId);
            intent.putExtra("music_class_name", musicCollectionItem2.mcName);
            intent.putExtra("music_category_is_hot", musicCollectionItem2.isHot);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.f84441c);
            intent.putExtra("music_class_enter_method", "click_category_list");
            intent.putExtra("music_class_level", musicCollectionItem2.level);
            intent.putExtra("sound_page_scene", this.f84442d);
            startActivityForResult(intent, 10001);
            C35936b.m73319a(musicCollectionItem2.mcName, "click_category_list", "", "change_music_page_detail", musicCollectionItem2.mcId);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f84444j == null) {
            this.f84444j = new C33933a(this);
        }
        this.f84444j.mo60166a(view);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.a19, viewGroup, false);
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
