package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a;

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
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57237e;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.C57283h;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.C57297r;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57310i;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57314l;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57321p;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.widgets.ChallengeMusicWidget;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.widgets.MusicBoardWidget;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.widgets.MusicClassWidget;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.widgets.MusicRadioWidget;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.widgets.StickerMusicWidget;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.a.a */
public final class C57172a extends AbstractC33938b {

    /* renamed from: d */
    public AbstractC57234b f130168d;

    /* renamed from: e */
    public AbstractC57237e f130169e;

    /* renamed from: f */
    public int f130170f;

    /* renamed from: g */
    public boolean f130171g;

    /* renamed from: h */
    public AbstractC57080c<C57192b> f130172h;

    /* renamed from: i */
    private int f130173i;

    /* renamed from: j */
    private RecyclerView f130174j;

    /* renamed from: k */
    private int f130175k;

    /* renamed from: w */
    private boolean f130176w;

    /* renamed from: x */
    private int f130177x;

    static {
        Covode.recordClassIndex(67073);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: c */
    public final int mo60933c() {
        if (this.f130176w) {
            return this.f130170f + 1;
        }
        return this.f130170f;
    }

    /* renamed from: l */
    public final void mo94374l() {
        if (((Integer) this.f80256b.mo60195b("music_position", (Object) -1)).intValue() != -1) {
            AbstractC57234b bVar = this.f130168d;
            if (bVar != null) {
                bVar.mo94416a((MusicModel) null);
            }
            this.f80256b.mo60191a("music_position", (Object) -1);
            this.f80256b.mo60191a("music_index", (Object) -1);
        }
    }

    /* renamed from: e */
    public final void mo94373e(int i) {
        this.f130176w = true;
        this.f130177x = i;
    }

    /* renamed from: d */
    public final void mo94372d(int i) {
        if (this.f130175k != i) {
            this.f130175k = i;
            mo94371a(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.arch.widgets.AbstractC33938b, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f130174j = recyclerView;
        recyclerView.mo4405a(new RecyclerView.AbstractC1371n() {
            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a.C57172a.C571731 */

            static {
                Covode.recordClassIndex(67074);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                super.mo4754a(recyclerView, i, i2);
                C57172a.this.mo94371a(false);
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        if (!this.f130176w) {
            if (i == 0) {
                if (this.f130171g) {
                    return 3;
                }
            } else if (i == 1) {
                return 1;
            }
            return 2;
        } else if (i == 0) {
            return this.f130177x;
        } else {
            if (i == 1) {
                if (this.f130171g) {
                    return 3;
                }
            } else if (i == 2) {
                return 1;
            }
            return 2;
        }
    }

    /* renamed from: a */
    public final void mo94371a(boolean z) {
        int i;
        int measuredHeight;
        RecyclerView.AbstractC1362i layoutManager = this.f130174j.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int k = linearLayoutManager.mo4371k();
            int m = linearLayoutManager.mo4373m();
            for (int i2 = k; i2 <= m; i2++) {
                View childAt = this.f130174j.getChildAt(i2 - k);
                if (childAt == null) {
                    return;
                }
                if (!this.f92274v || i2 != mo60933c()) {
                    ListItemWidget a = mo60185a(i2);
                    if (a instanceof MusicBoardWidget) {
                        if (z) {
                            ((MusicBoardWidget) a).mo94550e();
                        }
                        if (childAt.getTop() > 0) {
                            i = 0;
                        } else {
                            i = -childAt.getTop();
                        }
                        int measuredHeight2 = childAt.getMeasuredHeight();
                        int bottom = childAt.getBottom();
                        int i3 = this.f130175k;
                        if (bottom > i3) {
                            measuredHeight = (measuredHeight2 + i3) - childAt.getBottom();
                        } else {
                            measuredHeight = childAt.getMeasuredHeight();
                        }
                        ((MusicBoardWidget) a).mo94549a(i, measuredHeight);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.AbstractC33938b
    /* renamed from: b */
    public final ListItemWidget mo60187b(int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 1) {
            MusicClassWidget musicClassWidget = new MusicClassWidget();
            if (this.f130176w) {
                i--;
            }
            musicClassWidget.f130684h = i;
            musicClassWidget.f130685i = musicClassWidget.f130684h + 10086;
            return musicClassWidget;
        } else if (itemViewType == 2) {
            MusicBoardWidget musicBoardWidget = new MusicBoardWidget();
            musicBoardWidget.f130670h = this.f130168d;
            musicBoardWidget.f130678p = this.f130172h;
            if (this.f130176w) {
                i--;
            }
            musicBoardWidget.f130673k = i;
            musicBoardWidget.f130674l = musicBoardWidget.f130673k + 10086;
            return musicBoardWidget;
        } else if (itemViewType == 3) {
            MusicRadioWidget musicRadioWidget = new MusicRadioWidget();
            AbstractC57234b bVar = this.f130168d;
            C89219l.m154721d(bVar, "");
            musicRadioWidget.f130690j = bVar;
            musicRadioWidget.f130691k = this.f130172h;
            AbstractC57237e eVar = this.f130169e;
            C89219l.m154721d(eVar, "");
            musicRadioWidget.f130692l = eVar;
            if (this.f130176w) {
                i--;
            }
            musicRadioWidget.f130689i = i;
            return musicRadioWidget;
        } else if (itemViewType == 4) {
            StickerMusicWidget stickerMusicWidget = new StickerMusicWidget();
            stickerMusicWidget.f130699h = this.f130168d;
            stickerMusicWidget.f130704m = this.f130172h;
            stickerMusicWidget.f130705n = this.f130169e;
            stickerMusicWidget.f130701j = -2;
            stickerMusicWidget.f130702k = stickerMusicWidget.f130701j + 10086;
            return stickerMusicWidget;
        } else if (itemViewType != 5) {
            return null;
        } else {
            ChallengeMusicWidget challengeMusicWidget = new ChallengeMusicWidget();
            challengeMusicWidget.f130660i = this.f130168d;
            challengeMusicWidget.f130665n = this.f130172h;
            challengeMusicWidget.f130666o = this.f130169e;
            challengeMusicWidget.f130662k = -2;
            challengeMusicWidget.f130663l = challengeMusicWidget.f130662k + 10086;
            return challengeMusicWidget;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.arch.widgets.AbstractC33938b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C57314l(m103607a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i));
        }
        if (i == 3) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            C89219l.m154721d(from, "");
            C89219l.m154721d(viewGroup, "");
            View a = C1764a.m5927a(from, R.layout.adf, viewGroup, false);
            C89219l.m154716b(a, "");
            return new C57321p(a);
        } else if (i == 4) {
            C57297r rVar = new C57297r(m103607a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i), this.f130173i);
            rVar.f130505h = ((Boolean) this.f80256b.mo60192a("mvtheme_music_type")).booleanValue();
            rVar.f130506i = ((Boolean) this.f80256b.mo60192a("is_photo_mv_type")).booleanValue();
            return rVar;
        } else if (i != 5) {
            return new C57310i(m103607a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i), this.f130173i);
        } else {
            return new C57283h(m103607a(LayoutInflater.from(viewGroup.getContext()), viewGroup, i), this.f130173i);
        }
    }

    /* renamed from: a */
    private static View m103607a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        if (i == 1) {
            return C1764a.m5927a(layoutInflater, R.layout.age, viewGroup, false);
        }
        if (i == 5 || i == 4) {
            return C1764a.m5927a(layoutInflater, R.layout.ae5, viewGroup, false);
        }
        return C1764a.m5927a(layoutInflater, R.layout.agd, viewGroup, false);
    }

    public C57172a(C33947e eVar, DataCenter dataCenter, AbstractC57234b bVar, AbstractC57237e eVar2, AbstractC57080c<C57192b> cVar, int i) {
        super(eVar, dataCenter);
        this.f130168d = bVar;
        this.f130169e = eVar2;
        this.f130172h = cVar;
        this.f130173i = i;
    }
}
