package com.p2082ss.android.ugc.aweme.choosemusic.p2461a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.AbstractC33938b;
import com.p2082ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35757c;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35827b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35830e;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35962ac;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35985p;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36017m;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36021p;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler.C36041f;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.recycler.RecyclerMusicBoardWidget;
import com.p2082ss.android.ugc.aweme.choosemusic.widgets.ChallengeMusicWidget;
import com.p2082ss.android.ugc.aweme.choosemusic.widgets.MusicBoardWidget;
import com.p2082ss.android.ugc.aweme.choosemusic.widgets.MusicClassWidget;
import com.p2082ss.android.ugc.aweme.choosemusic.widgets.StickerMusicWidget;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.setting.C68027bm;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.a.a */
public final class C35701a extends AbstractC33938b {

    /* renamed from: d */
    public AbstractC35827b f84202d;

    /* renamed from: e */
    public AbstractC35830e f84203e;

    /* renamed from: f */
    public int f84204f;

    /* renamed from: g */
    public boolean f84205g;

    /* renamed from: h */
    public AbstractC60731k<C35757c> f84206h;

    /* renamed from: i */
    private int f84207i;

    /* renamed from: j */
    private RecyclerView f84208j;

    /* renamed from: k */
    private int f84209k;

    /* renamed from: w */
    private boolean f84210w;

    /* renamed from: x */
    private int f84211x;

    /* renamed from: y */
    private int f84212y;

    static {
        Covode.recordClassIndex(42933);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: c */
    public final int mo60933c() {
        if (this.f84210w) {
            return this.f84204f + 1;
        }
        return this.f84204f;
    }

    /* renamed from: a */
    public final void mo62741a() {
        if (((Integer) this.f80256b.mo60195b("music_position", (Object) -1)).intValue() != -1) {
            AbstractC35827b bVar = this.f84202d;
            if (bVar != null) {
                bVar.mo62875a((MusicModel) null);
            }
            this.f80256b.mo60191a("music_position", (Object) -1);
            this.f80256b.mo60191a("music_index", (Object) -1);
        }
    }

    /* renamed from: e */
    public final void mo62744e(int i) {
        this.f84210w = true;
        this.f84211x = i;
    }

    /* renamed from: d */
    public final void mo62743d(int i) {
        if (this.f84209k != i) {
            this.f84209k = i;
            mo62742a(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.arch.widgets.AbstractC33938b, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f84208j = recyclerView;
        recyclerView.mo4405a(new RecyclerView.AbstractC1371n() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35701a.C357021 */

            static {
                Covode.recordClassIndex(42934);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                super.mo4754a(recyclerView, i, i2);
                C35701a.this.mo62742a(false);
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        if (this.f84210w) {
            if (i == 0) {
                return this.f84211x;
            }
            if (i == 2) {
                return 1;
            }
            return 2;
        } else if (i == 1) {
            return 1;
        } else {
            return 2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.AbstractC33938b
    /* renamed from: b */
    public final ListItemWidget mo60187b(int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 1) {
            MusicClassWidget musicClassWidget = new MusicClassWidget(this.f84212y);
            if (this.f84210w) {
                i--;
            }
            musicClassWidget.f85214h = i;
            musicClassWidget.f85215i = musicClassWidget.f85214h + 10086;
            return musicClassWidget;
        } else if (itemViewType != 2) {
            if (itemViewType == 4) {
                StickerMusicWidget stickerMusicWidget = new StickerMusicWidget();
                stickerMusicWidget.f85219h = this.f84202d;
                stickerMusicWidget.f85224m = this.f84206h;
                stickerMusicWidget.f85225n = this.f84203e;
                stickerMusicWidget.f85221j = -2;
                stickerMusicWidget.f85222k = stickerMusicWidget.f85221j + 10086;
                return stickerMusicWidget;
            } else if (itemViewType != 5) {
                return null;
            } else {
                ChallengeMusicWidget challengeMusicWidget = new ChallengeMusicWidget();
                challengeMusicWidget.f85188i = this.f84202d;
                challengeMusicWidget.f85193n = this.f84206h;
                challengeMusicWidget.f85194o = this.f84203e;
                challengeMusicWidget.f85190k = -2;
                challengeMusicWidget.f85191l = challengeMusicWidget.f85190k + 10086;
                return challengeMusicWidget;
            }
        } else if (C68027bm.m120329a()) {
            RecyclerMusicBoardWidget recyclerMusicBoardWidget = new RecyclerMusicBoardWidget(this.f84212y);
            recyclerMusicBoardWidget.f85104h = this.f84202d;
            recyclerMusicBoardWidget.f85112p = this.f84206h;
            if (this.f84210w) {
                i--;
            }
            recyclerMusicBoardWidget.f85107k = i;
            recyclerMusicBoardWidget.f85108l = recyclerMusicBoardWidget.f85107k + 10086;
            return recyclerMusicBoardWidget;
        } else {
            MusicBoardWidget musicBoardWidget = new MusicBoardWidget(this.f84212y);
            musicBoardWidget.f85199h = this.f84202d;
            musicBoardWidget.f85207p = this.f84206h;
            if (this.f84210w) {
                i--;
            }
            musicBoardWidget.f85202k = i;
            musicBoardWidget.f85203l = musicBoardWidget.f85202k + 10086;
            return musicBoardWidget;
        }
    }

    /* renamed from: a */
    public final void mo62742a(boolean z) {
        int measuredHeight;
        int measuredHeight2;
        RecyclerView.AbstractC1362i layoutManager = this.f84208j.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int k = linearLayoutManager.mo4371k();
            int m = linearLayoutManager.mo4373m();
            for (int i = k; i <= m; i++) {
                View childAt = this.f84208j.getChildAt(i - k);
                if (childAt == null) {
                    return;
                }
                if (!this.f92274v || i != mo60933c()) {
                    ListItemWidget a = mo60185a(i);
                    int i2 = 0;
                    if (a instanceof MusicBoardWidget) {
                        if (z) {
                            ((MusicBoardWidget) a).mo63219e();
                        }
                        if (childAt.getTop() <= 0) {
                            i2 = -childAt.getTop();
                        }
                        int measuredHeight3 = childAt.getMeasuredHeight();
                        int bottom = childAt.getBottom();
                        int i3 = this.f84209k;
                        if (bottom > i3) {
                            measuredHeight2 = (measuredHeight3 + i3) - childAt.getBottom();
                        } else {
                            measuredHeight2 = childAt.getMeasuredHeight();
                        }
                        ((MusicBoardWidget) a).mo63218a(i2, measuredHeight2);
                    } else if (a instanceof RecyclerMusicBoardWidget) {
                        if (z) {
                            ((RecyclerMusicBoardWidget) a).mo63192e();
                        }
                        if (childAt.getTop() <= 0) {
                            i2 = -childAt.getTop();
                        }
                        int measuredHeight4 = childAt.getMeasuredHeight();
                        int bottom2 = childAt.getBottom();
                        int i4 = this.f84209k;
                        if (bottom2 > i4) {
                            measuredHeight = (measuredHeight4 + i4) - childAt.getBottom();
                        } else {
                            measuredHeight = childAt.getMeasuredHeight();
                        }
                        ((RecyclerMusicBoardWidget) a).mo63191a(i2, measuredHeight);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.arch.widgets.AbstractC33938b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C36021p(m72867a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i));
        }
        if (i == 4) {
            C35962ac acVar = new C35962ac(m72867a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i), this.f84207i);
            acVar.f84973h = ((Boolean) this.f80256b.mo60192a("mvtheme_music_type")).booleanValue();
            acVar.f84974i = ((Boolean) this.f80256b.mo60192a("is_photo_mv_type")).booleanValue();
            return acVar;
        } else if (i == 5) {
            return new C35985p(m72867a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i), this.f84207i);
        } else {
            if (C68027bm.m120329a()) {
                return new C36041f(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ah2, viewGroup, false), this.f84207i);
            }
            return new C36017m(m72867a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i), this.f84207i);
        }
    }

    /* renamed from: a */
    private static View m72867a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        if (i == 1) {
            return C1764a.m5927a(layoutInflater, R.layout.age, viewGroup, false);
        }
        if (i == 5 || i == 4) {
            return C1764a.m5927a(layoutInflater, R.layout.ae5, viewGroup, false);
        }
        return C1764a.m5927a(layoutInflater, R.layout.agd, viewGroup, false);
    }

    public C35701a(C33947e eVar, DataCenter dataCenter, AbstractC35827b bVar, AbstractC35830e eVar2, AbstractC60731k<C35757c> kVar, int i, int i2) {
        super(eVar, dataCenter);
        this.f84202d = bVar;
        this.f84203e = eVar2;
        this.f84206h = kVar;
        this.f84207i = i;
        this.f84212y = i2;
    }
}
