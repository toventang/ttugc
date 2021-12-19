package com.p2082ss.android.ugc.aweme.kids.choosemusic.widgets;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.C33937a;
import com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57191a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57237e;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57268c;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57269d;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57273b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.C57283h;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57320o;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.widgets.ChallengeMusicWidget */
public class ChallengeMusicWidget extends ListItemWidget<C57283h> implements AbstractC1214u<C33942b>, AbstractC33974au {

    /* renamed from: h */
    Challenge f130659h;

    /* renamed from: i */
    public AbstractC57234b f130660i;

    /* renamed from: j */
    int f130661j = -1;

    /* renamed from: k */
    public int f130662k;

    /* renamed from: l */
    public int f130663l;

    /* renamed from: m */
    C57171a f130664m;

    /* renamed from: n */
    public AbstractC57080c<C57192b> f130665n;

    /* renamed from: o */
    public AbstractC57237e f130666o;

    /* renamed from: p */
    private int f130667p;

    static {
        Covode.recordClassIndex(67237);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: e */
    public final void mo94548e() {
        this.f130660i.mo94416a((MusicModel) null);
    }

    /* renamed from: f */
    private void m103922f() {
        if (this.f130659h == null) {
            ((C57283h) ((ListItemWidget) this).f80253a).itemView.setVisibility(8);
            return;
        }
        ((C57283h) ((ListItemWidget) this).f80253a).itemView.setVisibility(0);
        ((AbstractC57273b) ((ListItemWidget) this).f80253a).mo94474a(this.f130659h, C57269d.m103832b(this.f130659h.getConnectMusics()), ((Integer) this.f80273e.mo60195b("music_position", (Object) -1)).intValue(), this.f130661j, (String) this.f80273e.mo60195b("challenge_id", (Object) null), new C57337a(this), this.f130665n);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        this.f80273e.mo60189a("data_challenge", (AbstractC1214u<C33942b>) this).mo60189a("music_index", (AbstractC1214u<C33942b>) this).mo60189a("music_collect_status", (AbstractC1214u<C33942b>) this).mo60189a("music_loading", (AbstractC1214u<C33942b>) this);
        this.f130667p = ((Integer) this.f80273e.mo60192a("key_choose_music_type")).intValue();
        super.onCreate();
        C57171a aVar = new C57171a("change_music_page", "attached_song", "", C57268c.f130442a);
        this.f130664m = aVar;
        aVar.f130165g = (String) this.f80273e.mo60195b("challenge_id", (Object) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget
    /* renamed from: a */
    public final void mo60183a(C33937a aVar) {
        super.mo60183a(aVar);
        this.f130659h = (Challenge) this.f80273e.mo60192a("data_challenge");
        m103922f();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.lifecycle.AbstractC1214u
    public /* synthetic */ void onChanged(C33942b bVar) {
        char c;
        MusicModel.CollectionType collectionType;
        C33942b bVar2 = bVar;
        String str = bVar2.f80277a;
        str.hashCode();
        int i = -1;
        switch (str.hashCode()) {
            case -1635157503:
                if (str.equals("music_collect_status")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 502104354:
                if (str.equals("music_loading")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1579846200:
                if (str.equals("music_index")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2085247502:
                if (str.equals("data_challenge")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                C57191a aVar = (C57191a) bVar2.mo60212a();
                if (((aVar.f130231a == 1 && this.f130662k == aVar.f130232b) || aVar.f130231a == 0) && ((ListItemWidget) this).f80253a != null) {
                    AbstractC57273b bVar3 = (AbstractC57273b) ((ListItemWidget) this).f80253a;
                    if (!C13603b.m24435a((Collection) bVar3.f130465c)) {
                        for (C57320o oVar : bVar3.f130465c) {
                            MusicModel musicModel = aVar.f130235e;
                            if (!(musicModel == null || TextUtils.isEmpty(musicModel.getMusicId()) || oVar.f130555u == null || !musicModel.getMusicId().equals(oVar.f130555u.getMusicId()))) {
                                MusicModel musicModel2 = oVar.f130555u;
                                if (aVar.f130234d == 1) {
                                    collectionType = MusicModel.CollectionType.COLLECTED;
                                } else {
                                    collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                                }
                                musicModel2.setCollectionType(collectionType);
                                oVar.mo94505c();
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (((ListItemWidget) this).f80253a != null) {
                    Integer num = (Integer) this.f80273e.mo60192a("music_position");
                    if (num != null) {
                        i = num.intValue();
                    }
                    if (this.f130662k == i) {
                        AbstractC57273b bVar4 = (AbstractC57273b) ((ListItemWidget) this).f80253a;
                        int intValue = ((Integer) this.f80273e.mo60192a("music_index")).intValue();
                        boolean booleanValue = ((Boolean) this.f80273e.mo60192a("music_loading")).booleanValue();
                        if (intValue >= 0 && intValue < bVar4.f130465c.size()) {
                            bVar4.f130465c.get(intValue).mo94503a(booleanValue, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                int intValue2 = ((Integer) this.f80273e.mo60195b("music_position", (Object) -1)).intValue();
                int intValue3 = ((Integer) this.f80273e.mo60195b("music_index", (Object) -1)).intValue();
                if (ai_()) {
                    AbstractC57273b bVar5 = (AbstractC57273b) ((ListItemWidget) this).f80253a;
                    int i2 = this.f130661j;
                    if (i2 >= 0 && i2 < bVar5.f130465c.size()) {
                        bVar5.f130465c.get(i2).mo94503a(false, false);
                    }
                    if (intValue2 != -2) {
                        this.f130661j = -1;
                        return;
                    } else if (this.f130661j == intValue3) {
                        this.f130660i.mo94416a((MusicModel) null);
                        return;
                    } else {
                        this.f130661j = intValue3;
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                this.f130659h = (Challenge) bVar2.mo60212a();
                m103922f();
                return;
            default:
                return;
        }
    }
}
