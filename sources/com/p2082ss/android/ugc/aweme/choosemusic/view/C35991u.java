package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35703b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35757c;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35826a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36050s;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61143be;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.u */
public final class C35991u extends AbstractC35981m<MusicModel> {

    /* renamed from: m */
    boolean f84982m;

    /* renamed from: n */
    boolean f84983n;

    /* renamed from: o */
    public long f84984o;

    /* renamed from: p */
    public String f84985p;

    /* renamed from: q */
    private boolean f84986q;

    static {
        Covode.recordClassIndex(43237);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35981m
    /* renamed from: d */
    public final AbstractC39060f mo63133d() {
        C35703b bVar;
        if (this.f84961l) {
            bVar = new C35703b(this.f84957h, C35993v.f84988a);
        } else {
            bVar = new C35703b((AbstractC60731k<C35757c>) this.f84957h, false);
        }
        bVar.f84223f = this.f84982m;
        bVar.f84224g = this.f84983n;
        bVar.f84226i = this.f84958i;
        return bVar;
    }

    /* renamed from: a */
    public final void mo63140a(int i) {
        this.f84950a.setTitle(i);
    }

    /* renamed from: a */
    public final void mo63142a(C35754b bVar) {
        if (this.f84955f instanceof C35703b) {
            ((C35703b) this.f84955f).f84222e = bVar;
        }
    }

    /* renamed from: a */
    public final void mo63143a(AbstractC35827b bVar) {
        if (this.f84955f instanceof C35703b) {
            ((C35703b) this.f84955f).f84218a = bVar;
        }
    }

    /* renamed from: b */
    public final void mo63146b(boolean z) {
        this.f84983n = z;
        if (this.f84955f instanceof C35703b) {
            ((C35703b) this.f84955f).f84224g = this.f84983n;
        }
    }

    /* renamed from: a */
    private void m73405a(List<MusicModel> list) {
        if (!this.f84986q) {
            this.f84986q = true;
            if (!(TextUtils.isEmpty(this.f84985p) || list == null)) {
                for (int i = 0; i < list.size(); i++) {
                    MusicModel musicModel = list.get(i);
                    if (musicModel != null && this.f84985p.equals(musicModel.getMusicId()) && (this.f84955f instanceof C35703b)) {
                        this.f84951b.post(new RunnableC35994w(this, i, musicModel));
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo63144a(boolean z) {
        this.f84982m = z;
        if (this.f84955f instanceof C35703b) {
            ((C35703b) this.f84955f).f84223f = this.f84982m;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo63141a(int i, MusicModel musicModel) {
        C359921 r1 = new C1481r(this.f84954e) {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.view.C35991u.C359921 */

            static {
                Covode.recordClassIndex(43238);
            }

            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: c */
            public final int mo5016c() {
                return -1;
            }
        };
        r1.f4515g = i;
        RecyclerView.AbstractC1362i layoutManager = this.f84951b.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.mo4695a(r1);
        }
        this.f84951b.post(new RunnableC35995x(this, i, musicModel));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo63145b(int i, MusicModel musicModel) {
        RecyclerView.ViewHolder f = this.f84951b.mo4451f(i);
        if (f instanceof C36050s) {
            ((C35703b) this.f84955f).mo62746a((C36050s) f, musicModel);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35981m, com.p2082ss.android.ugc.aweme.arch.AbstractC33936c
    /* renamed from: a */
    public final void mo60176a(List<MusicModel> list, boolean z) {
        super.mo60176a(list, z);
        if (list != null && this.f84984o > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("tab_name", "local_song");
            hashMap.put("show_duration", String.valueOf(System.currentTimeMillis() - this.f84984o));
            C39162r.m79461a("local_music_show_duration", C61143be.m110761a(hashMap));
        }
        m73405a(list);
    }

    public C35991u(Context context, View view, AbstractC35826a aVar, AbstractC39063h.AbstractC39067a aVar2, int i) {
        super(context, view, aVar, aVar2, i);
    }

    public C35991u(Context context, View view, AbstractC35826a aVar, AbstractC39063h.AbstractC39067a aVar2, AbstractC60731k<C35757c> kVar, int i) {
        super(context, view, aVar, aVar2, kVar, i);
    }

    public C35991u(Context context, View view, AbstractC35826a aVar, int i, AbstractC39063h.AbstractC39067a aVar2, AbstractC60731k<C35757c> kVar, int i2) {
        super(context, view, aVar, i, aVar2, kVar, i2);
    }
}
