package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35714i;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35826a;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.y */
public final class C35996y extends AbstractC35981m<MusicCollectionItem> {
    static {
        Covode.recordClassIndex(43242);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35981m
    /* renamed from: d */
    public final AbstractC39060f mo63133d() {
        C35714i iVar = new C35714i();
        iVar.f84246a = new C35997z(this);
        return iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo63150a(MusicCollectionItem musicCollectionItem) {
        if (this.f84956g != null) {
            this.f84956g.mo62848b(musicCollectionItem);
        }
    }

    public C35996y(Context context, View view, AbstractC35826a aVar, AbstractC39063h.AbstractC39067a aVar2, int i) {
        super(context, view, aVar, R.string.dg5, aVar2, null, i);
    }
}
