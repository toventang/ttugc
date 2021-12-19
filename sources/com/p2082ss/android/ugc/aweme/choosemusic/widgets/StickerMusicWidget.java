package com.p2082ss.android.ugc.aweme.choosemusic.widgets;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.C33937a;
import com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35755a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35757c;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35830e;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35937c;
import com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35984o;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35962ac;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36050s;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.StickerMusicWidget */
public class StickerMusicWidget extends ListItemWidget<C35962ac> implements AbstractC1214u<C33942b>, AbstractC33974au {

    /* renamed from: h */
    public AbstractC35827b f85219h;

    /* renamed from: i */
    int f85220i = -1;

    /* renamed from: j */
    public int f85221j;

    /* renamed from: k */
    public int f85222k;

    /* renamed from: l */
    C35754b f85223l;

    /* renamed from: m */
    public AbstractC60731k<C35757c> f85224m;

    /* renamed from: n */
    public AbstractC35830e f85225n;

    /* renamed from: o */
    private int f85226o;

    /* renamed from: p */
    private List<Music> f85227p;

    static {
        Covode.recordClassIndex(43319);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: e */
    public final void mo63223e() {
        this.f85219h.mo62875a((MusicModel) null);
    }

    /* renamed from: f */
    private void m73518f() {
        if (C13617h.m24465a(this.f85227p)) {
            ((C35962ac) ((ListItemWidget) this).f80253a).itemView.setVisibility(8);
            return;
        }
        List<MusicModel> b = C35937c.m73327b(this.f85227p);
        ((C35962ac) ((ListItemWidget) this).f80253a).itemView.setVisibility(0);
        ((AbstractC35984o) ((ListItemWidget) this).f80253a).mo63138a(b, ((Integer) this.f80273e.mo60195b("music_position", (Object) -1)).intValue(), this.f85220i, ((Boolean) this.f80273e.mo60195b("data_sticker_music_from_video", (Object) false)).booleanValue(), (String) this.f80273e.mo60195b("sticker_id", (Object) null), new C36075g(this), this.f85224m);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        this.f80273e.mo60189a("data_sticker", (AbstractC1214u<C33942b>) this).mo60189a("music_index", (AbstractC1214u<C33942b>) this).mo60189a("music_collect_status", (AbstractC1214u<C33942b>) this).mo60189a("music_loading", (AbstractC1214u<C33942b>) this);
        this.f85226o = ((Integer) this.f80273e.mo60192a("key_choose_music_type")).intValue();
        super.onCreate();
        C35754b bVar = new C35754b("change_music_page", "attached_song", "", C35936b.f84812a);
        this.f85223l = bVar;
        bVar.f84348b = "prop";
        this.f85223l.f84352f = (String) this.f80273e.mo60195b("sticker_id", (Object) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget
    /* renamed from: a */
    public final void mo60183a(C33937a aVar) {
        super.mo60183a(aVar);
        this.f85227p = (List) this.f80273e.mo60195b("data_sticker", (Object) null);
        m73518f();
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
            case 1730565544:
                if (str.equals("data_sticker")) {
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
                C35755a aVar = (C35755a) bVar2.mo60212a();
                if (((aVar.f84357a == 1 && this.f85221j == aVar.f84358b) || aVar.f84357a == 0) && ((ListItemWidget) this).f80253a != null) {
                    AbstractC35984o oVar = (AbstractC35984o) ((ListItemWidget) this).f80253a;
                    if (!C13603b.m24435a((Collection) oVar.f84968c)) {
                        for (C36050s sVar : oVar.f84968c) {
                            MusicModel musicModel = aVar.f84361e;
                            if (!(musicModel == null || TextUtils.isEmpty(musicModel.getMusicId()) || sVar.f85027w == null || !musicModel.getMusicId().equals(sVar.f85027w.getMusicId()))) {
                                MusicModel musicModel2 = sVar.f85027w;
                                if (aVar.f84360d == 1) {
                                    collectionType = MusicModel.CollectionType.COLLECTED;
                                } else {
                                    collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                                }
                                musicModel2.setCollectionType(collectionType);
                                sVar.mo63158d();
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
                    if (this.f85221j == i) {
                        AbstractC35984o oVar2 = (AbstractC35984o) ((ListItemWidget) this).f80253a;
                        int intValue = ((Integer) this.f80273e.mo60192a("music_index")).intValue();
                        boolean booleanValue = ((Boolean) this.f80273e.mo60192a("music_loading")).booleanValue();
                        if (intValue >= 0 && intValue < oVar2.f84968c.size()) {
                            oVar2.f84968c.get(intValue).mo63155a(booleanValue, true);
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
                    AbstractC35984o oVar3 = (AbstractC35984o) ((ListItemWidget) this).f80253a;
                    int i2 = this.f85220i;
                    if (i2 >= 0 && i2 < oVar3.f84968c.size()) {
                        oVar3.f84968c.get(i2).mo63155a(false, false);
                    }
                    if (intValue2 != -2) {
                        this.f85220i = -1;
                        return;
                    } else if (this.f85220i == intValue3) {
                        this.f85219h.mo62875a((MusicModel) null);
                        return;
                    } else {
                        this.f85220i = intValue3;
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                this.f85227p = (List) bVar2.mo60212a();
                m73518f();
                return;
            default:
                return;
        }
    }
}
