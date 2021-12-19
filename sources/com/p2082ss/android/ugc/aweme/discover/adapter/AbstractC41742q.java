package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67363b;
import com.p2082ss.android.ugc.aweme.search.p3686d.C67365d;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.q */
public abstract class AbstractC41742q<T> extends AbstractC34766g<T> {

    /* renamed from: d */
    public C67678d f97368d;

    /* renamed from: e */
    protected AbstractC57066a.AbstractC57068b f97369e;

    /* renamed from: f */
    protected C67365d f97370f;

    static {
        Covode.recordClassIndex(49655);
    }

    AbstractC41742q() {
    }

    /* renamed from: l */
    public final String mo70924l() {
        AbstractC57066a.AbstractC57068b bVar = this.f97369e;
        if (bVar == null || bVar.mo94218a() == null) {
            return "";
        }
        return this.f97369e.mo94218a().f129938a;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: c_ */
    public int mo63367c_(View view) {
        return (int) C13628n.m24520b(view.getContext(), 45.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: a */
    public void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        super.mo60186a(viewHolder, i);
    }

    public AbstractC41742q(C67678d dVar, AbstractC57066a.AbstractC57068b bVar, AbstractC67363b bVar2) {
        this.f97369e = bVar;
        this.f97368d = dVar;
        this.f97370f = new C67365d(SettingsManager.m29616a().mo25394a("common_search_load_more_remains", 0), bVar2);
    }
}
