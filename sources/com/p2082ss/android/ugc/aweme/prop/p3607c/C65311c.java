package com.p2082ss.android.ugc.aweme.prop.p3607c;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.challenge.p2451g.C35530h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.prop.api.StickerPropApi;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.prop.c.c */
public final class C65311c extends AbstractC39100a<Aweme, C65310b> {

    /* renamed from: b */
    public static int f147417b;

    /* renamed from: a */
    String f147418a;

    /* renamed from: c */
    public StickerPropApi f147419c = ((StickerPropApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(StickerPropApi.class));

    /* renamed from: d */
    private int f147420d;

    static {
        Covode.recordClassIndex(76790);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C65310b) this.mData).f147411a;
    }

    public C65311c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isDataEmpty() {
        if ((this.mData == null || !((C65310b) this.mData).mo104471a()) && C13603b.m24435a((Collection) getItems())) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((C65310b) this.mData).mo104471a()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 3) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final /* synthetic */ boolean deleteItem(Aweme aweme) {
        return C50545m.m94763a(getItems(), aweme, this.mNotifyListeners);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        m116991a((String) objArr[1], 0, ((Integer) objArr[2]).intValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void setItems(List<Aweme> list) {
        if (this.mData == null) {
            this.mData = new C65310b();
        }
        ((C65310b) this.mData).f147413c = 1;
        ((C65310b) this.mData).f147411a = list;
    }

    public C65311c(String str) {
        this.f147418a = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        long j;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((C65310b) this.mData).f147412b;
        }
        m116991a(str, j, ((Integer) objArr[2]).intValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        C65310b bVar = (C65310b) obj;
        if (bVar == null || (C13603b.m24435a((Collection) bVar.f147411a) && !bVar.mo104471a())) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (bVar.f147411a != null) {
                int size = bVar.f147411a.size();
                for (int i = 0; i < size; i++) {
                    Aweme a = AwemeService.m70060b().mo60677a(bVar.f147411a.get(i));
                    a.setIsTop(bVar.f147411a.get(i).getIsTop());
                    RequestIdService.m70076a().mo60694a(a.getAid() + (this.f147420d + 10000), bVar.f147414d, i);
                    bVar.f147411a.set(i, a);
                    if (bVar.f147415e != null) {
                        C48027ac.C48028a.f111257a.mo80056a(bVar.f147414d, bVar.f147415e);
                    }
                }
            }
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = bVar;
            } else if (i2 == 4) {
                if (bVar.f147411a != null) {
                    if (C13603b.m24435a((Collection) ((C65310b) this.mData).f147411a)) {
                        ((C65310b) this.mData).f147411a = bVar.f147411a;
                    } else {
                        C35530h.m72624a(((C65310b) this.mData).f147411a, bVar.f147411a, C65313d.f147425a);
                    }
                }
                ((C65310b) this.mData).f147412b = bVar.f147412b;
                ((C65310b) this.mData).f147413c = bVar.f147413c & ((C65310b) this.mData).f147413c;
            }
        } else if (this.mData != null) {
            ((C65310b) this.mData).f147413c = 0;
        }
    }

    /* renamed from: a */
    private void m116991a(final String str, final long j, int i) {
        if (!C80580in.m139687c()) {
            this.f147420d = i;
            C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
                /* class com.p2082ss.android.ugc.aweme.prop.p3607c.C65311c.CallableC653121 */

                /* renamed from: c */
                final /* synthetic */ int f147423c = 20;

                static {
                    Covode.recordClassIndex(76791);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    if (TextUtils.equals(C65311c.this.f147418a, "from_sticker_master_profile")) {
                        return C65311c.this.f147419c.queryStickerAwemeList(str, j, this.f147423c, 1, C65311c.f147417b).get();
                    }
                    return C65311c.this.f147419c.queryStickerAwemeList(str, j, this.f147423c, C65311c.f147417b).get();
                }
            }, 0);
        }
    }
}
