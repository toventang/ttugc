package com.p2082ss.android.ugc.aweme.tools.beauty.p4095g;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.core.content.p032a.C0637f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77878d;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77974h;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77861e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77864g;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.f */
public final class C77918f {

    /* renamed from: a */
    public final HashMap<BeautySeekBar, ComposerBeautyExtraBeautify.ItemsBean> f174799a = new HashMap<>();

    /* renamed from: b */
    public final AbstractC77967m f174800b;

    /* renamed from: c */
    public final ComposerBeautyViewImpl f174801c;

    static {
        Covode.recordClassIndex(91007);
    }

    /* renamed from: b */
    private final boolean m136068b() {
        C77861e viewConfig = this.f174801c.getViewConfig();
        if (viewConfig == null || !viewConfig.f174732j) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.f$a */
    public static final class C77919a implements BeautySeekBar.AbstractC78062c {

        /* renamed from: a */
        final /* synthetic */ C77918f f174802a;

        /* renamed from: b */
        final /* synthetic */ BeautySeekBar f174803b;

        static {
            Covode.recordClassIndex(91008);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.AbstractC78062c
        /* renamed from: a */
        public final void mo121572a() {
            T t;
            AbstractC78056f.AbstractC78058b beautyOnInteractListener;
            T t2;
            AbstractC78056f.AbstractC78058b beautyOnInteractListener2;
            String tag;
            T t3;
            AbstractC78056f.AbstractC78058b beautyOnInteractListener3;
            T t4;
            AbstractC78056f.AbstractC78058b beautyOnInteractListener4;
            String tag2;
            C77918f fVar = this.f174802a;
            BeautySeekBar beautySeekBar = this.f174803b;
            boolean z = fVar.f174801c.f175232r;
            String str = "";
            T t5 = null;
            if (z) {
                if (fVar.mo121571a()) {
                    Iterator<T> it = fVar.f174801c.getAlbumAdapter().f174570a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t4 = null;
                            break;
                        }
                        t4 = it.next();
                        if (C89219l.m154714a((Object) t4, (Object) fVar.f174801c.getCurSelectAlbumBeauty())) {
                            break;
                        }
                    }
                    T t6 = t4;
                    if (!(t6 == null || (beautyOnInteractListener4 = fVar.f174801c.getBeautyOnInteractListener()) == null)) {
                        ComposerBeautyExtraBeautify.ItemsBean itemsBean = fVar.f174799a.get(beautySeekBar);
                        if (!(itemsBean == null || (tag2 = itemsBean.getTag()) == null)) {
                            str = tag2;
                        }
                        beautyOnInteractListener4.mo22667a(t6, C89070n.m154516a(str));
                    }
                } else {
                    Iterator<T> it2 = fVar.f174801c.getAlbumAdapter().f174570a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t3 = null;
                            break;
                        }
                        t3 = it2.next();
                        if (C89219l.m154714a((Object) t3, (Object) fVar.f174801c.getCurSelectAlbumBeauty())) {
                            break;
                        }
                    }
                    T t7 = t3;
                    if (!(t7 == null || (beautyOnInteractListener3 = fVar.f174801c.getBeautyOnInteractListener()) == null)) {
                        beautyOnInteractListener3.mo22667a(t7, C77918f.m136066a((ComposerBeauty) t7));
                    }
                }
            } else if (!z) {
                if (fVar.mo121571a()) {
                    Iterator<T> it3 = fVar.f174801c.getCategoryAdapter().f174570a.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it3.next();
                        if (C89219l.m154714a((Object) t2, (Object) fVar.f174801c.getCurSelectBeauty())) {
                            break;
                        }
                    }
                    T t8 = t2;
                    if (!(t8 == null || (beautyOnInteractListener2 = fVar.f174801c.getBeautyOnInteractListener()) == null)) {
                        ComposerBeautyExtraBeautify.ItemsBean itemsBean2 = fVar.f174799a.get(beautySeekBar);
                        if (!(itemsBean2 == null || (tag = itemsBean2.getTag()) == null)) {
                            str = tag;
                        }
                        beautyOnInteractListener2.mo22667a(t8, C89070n.m154516a(str));
                    }
                } else {
                    Iterator<T> it4 = fVar.f174801c.getCategoryAdapter().f174570a.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it4.next();
                        if (C89219l.m154714a((Object) t, (Object) fVar.f174801c.getCurSelectBeauty())) {
                            break;
                        }
                    }
                    T t9 = t;
                    if (!(t9 == null || (beautyOnInteractListener = fVar.f174801c.getBeautyOnInteractListener()) == null)) {
                        beautyOnInteractListener.mo22667a(t9, C77918f.m136066a((ComposerBeauty) t9));
                    }
                }
            }
            C77918f fVar2 = this.f174802a;
            boolean z2 = fVar2.f174801c.f175232r;
            if (z2) {
                Iterator<T> it5 = fVar2.f174801c.getAlbumAdapter().f174570a.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    T next = it5.next();
                    if (C89219l.m154714a((Object) next, (Object) fVar2.f174801c.getCurSelectAlbumBeauty())) {
                        t5 = next;
                        break;
                    }
                }
                T t10 = t5;
                if (t10 != null) {
                    fVar2.mo121569a(t10, true, false);
                }
            } else if (!z2) {
                Iterator<T> it6 = fVar2.f174801c.getCategoryAdapter().f174570a.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    T next2 = it6.next();
                    if (C89219l.m154714a((Object) next2, (Object) fVar2.f174801c.getCurSelectBeauty())) {
                        t5 = next2;
                        break;
                    }
                }
                T t11 = t5;
                if (t11 != null) {
                    fVar2.mo121569a(t11, true, false);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.AbstractC78062c
        /* renamed from: b */
        public final void mo121574b(int i) {
            T t;
            AbstractC78056f.AbstractC78058b beautyOnInteractListener;
            T t2;
            AbstractC78056f.AbstractC78058b beautyOnInteractListener2;
            String str;
            T t3;
            AbstractC78056f.AbstractC78058b beautyOnInteractListener3;
            T t4;
            AbstractC78056f.AbstractC78058b beautyOnInteractListener4;
            String str2;
            C77918f fVar = this.f174802a;
            BeautySeekBar beautySeekBar = this.f174803b;
            boolean z = fVar.f174801c.f175232r;
            T t5 = null;
            if (z) {
                if (fVar.mo121571a()) {
                    Iterator<T> it = fVar.f174801c.getAlbumAdapter().f174570a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t4 = null;
                            break;
                        }
                        t4 = it.next();
                        if (C89219l.m154714a((Object) t4, (Object) fVar.f174801c.getCurSelectAlbumBeauty())) {
                            break;
                        }
                    }
                    T t6 = t4;
                    if (!(t6 == null || (beautyOnInteractListener4 = fVar.f174801c.getBeautyOnInteractListener()) == null)) {
                        ComposerBeautyExtraBeautify.ItemsBean itemsBean = fVar.f174799a.get(beautySeekBar);
                        if (itemsBean == null || (str2 = itemsBean.getTag()) == null) {
                            str2 = "";
                        }
                        beautyOnInteractListener4.mo22666a(t6, i, C89070n.m154516a(str2));
                    }
                } else {
                    Iterator<T> it2 = fVar.f174801c.getAlbumAdapter().f174570a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t3 = null;
                            break;
                        }
                        t3 = it2.next();
                        if (C89219l.m154714a((Object) t3, (Object) fVar.f174801c.getCurSelectAlbumBeauty())) {
                            break;
                        }
                    }
                    T t7 = t3;
                    if (!(t7 == null || (beautyOnInteractListener3 = fVar.f174801c.getBeautyOnInteractListener()) == null)) {
                        beautyOnInteractListener3.mo22666a(t7, i, C77918f.m136066a((ComposerBeauty) t7));
                    }
                }
            } else if (!z) {
                if (fVar.mo121571a()) {
                    Iterator<T> it3 = fVar.f174801c.getCategoryAdapter().f174570a.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it3.next();
                        if (C89219l.m154714a((Object) t2, (Object) fVar.f174801c.getCurSelectBeauty())) {
                            break;
                        }
                    }
                    T t8 = t2;
                    if (!(t8 == null || (beautyOnInteractListener2 = fVar.f174801c.getBeautyOnInteractListener()) == null)) {
                        ComposerBeautyExtraBeautify.ItemsBean itemsBean2 = fVar.f174799a.get(beautySeekBar);
                        if (itemsBean2 == null || (str = itemsBean2.getTag()) == null) {
                            str = "";
                        }
                        beautyOnInteractListener2.mo22666a(t8, i, C89070n.m154516a(str));
                    }
                } else {
                    Iterator<T> it4 = fVar.f174801c.getCategoryAdapter().f174570a.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it4.next();
                        if (C89219l.m154714a((Object) t, (Object) fVar.f174801c.getCurSelectBeauty())) {
                            break;
                        }
                    }
                    T t9 = t;
                    if (!(t9 == null || (beautyOnInteractListener = fVar.f174801c.getBeautyOnInteractListener()) == null)) {
                        beautyOnInteractListener.mo22666a(t9, i, C77918f.m136066a((ComposerBeauty) t9));
                    }
                }
            }
            C77918f fVar2 = this.f174802a;
            C77921c cVar = new C77921c(fVar2, this.f174803b, i);
            boolean z2 = fVar2.f174801c.f175232r;
            if (z2) {
                Iterator<T> it5 = fVar2.f174801c.getAlbumAdapter().f174570a.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    T next = it5.next();
                    if (C89219l.m154714a((Object) next, (Object) fVar2.f174801c.getCurSelectAlbumBeauty())) {
                        t5 = next;
                        break;
                    }
                }
                T t10 = t5;
                if (t10 != null) {
                    cVar.mo121576a(t10);
                    fVar2.f174800b.mo121606c(t10);
                }
            } else if (!z2) {
                Iterator<T> it6 = fVar2.f174801c.getCategoryAdapter().f174570a.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    T next2 = it6.next();
                    if (C89219l.m154714a((Object) next2, (Object) fVar2.f174801c.getCurSelectBeauty())) {
                        t5 = next2;
                        break;
                    }
                }
                T t11 = t5;
                if (t11 != null) {
                    cVar.mo121576a(t11);
                    fVar2.f174800b.mo121606c(t11);
                    int indexOf = fVar2.f174801c.getCategoryAdapter().f174570a.indexOf(t11);
                    if (indexOf >= 0 && indexOf < fVar2.f174801c.getCategoryAdapter().f174570a.size()) {
                        fVar2.f174801c.getCategoryAdapter().mo121443a(t11);
                    }
                }
            }
            if (fVar2.f174801c.getViewConfig().f174735m) {
                BeautySwitchView swEnableBeauty = fVar2.f174801c.getSwEnableBeauty();
                C89219l.m154716b(swEnableBeauty, "");
                if (!swEnableBeauty.f175182b) {
                    BeautySwitchView swEnableBeauty2 = fVar2.f174801c.getSwEnableBeauty();
                    C89219l.m154716b(swEnableBeauty2, "");
                    swEnableBeauty2.setChecked(true);
                    AbstractC78056f.AbstractC78057a beautyViewListener = fVar2.f174801c.getBeautyViewListener();
                    if (beautyViewListener != null) {
                        beautyViewListener.mo121551a(true);
                    }
                }
            }
            fVar2.f174801c.getResetHelper().mo121558a();
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.AbstractC78062c
        /* renamed from: a */
        public final void mo121573a(int i) {
            T t;
            AbstractC78056f.AbstractC78058b beautyOnInteractListener;
            T t2;
            AbstractC78056f.AbstractC78058b beautyOnInteractListener2;
            String tag;
            T t3;
            AbstractC78056f.AbstractC78058b beautyOnInteractListener3;
            T t4;
            AbstractC78056f.AbstractC78058b beautyOnInteractListener4;
            String tag2;
            BeautySeekBar beautySeekBar = this.f174803b;
            C77864g gVar = this.f174802a.f174801c.getViewConfig().f174692d;
            int percent = beautySeekBar.getPercent();
            if (gVar.f174701a) {
                int suggestPercent = beautySeekBar.getSuggestPercent();
                int i2 = gVar.f174702b;
                int i3 = suggestPercent - i2;
                if (i3 < beautySeekBar.getMinPercent()) {
                    i3 = beautySeekBar.getMaxPercent();
                }
                int i4 = i2 + suggestPercent;
                if (i4 > beautySeekBar.getMaxPercent()) {
                    i4 = beautySeekBar.getMaxPercent();
                }
                if (i3 <= percent && i4 >= percent) {
                    beautySeekBar.setPercent(suggestPercent);
                    percent = suggestPercent;
                }
            }
            C77918f fVar = this.f174802a;
            BeautySeekBar beautySeekBar2 = this.f174803b;
            boolean z = fVar.f174801c.f175232r;
            String str = "";
            T t5 = null;
            if (z) {
                if (fVar.mo121571a()) {
                    Iterator<T> it = fVar.f174801c.getAlbumAdapter().f174570a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t4 = null;
                            break;
                        }
                        t4 = it.next();
                        if (C89219l.m154714a((Object) t4, (Object) fVar.f174801c.getCurSelectAlbumBeauty())) {
                            break;
                        }
                    }
                    T t6 = t4;
                    if (!(t6 == null || (beautyOnInteractListener4 = fVar.f174801c.getBeautyOnInteractListener()) == null)) {
                        ComposerBeautyExtraBeautify.ItemsBean itemsBean = fVar.f174799a.get(beautySeekBar2);
                        if (!(itemsBean == null || (tag2 = itemsBean.getTag()) == null)) {
                            str = tag2;
                        }
                        beautyOnInteractListener4.mo22670b(t6, C89070n.m154516a(str));
                    }
                } else {
                    Iterator<T> it2 = fVar.f174801c.getAlbumAdapter().f174570a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t3 = null;
                            break;
                        }
                        t3 = it2.next();
                        if (C89219l.m154714a((Object) t3, (Object) fVar.f174801c.getCurSelectAlbumBeauty())) {
                            break;
                        }
                    }
                    T t7 = t3;
                    if (!(t7 == null || (beautyOnInteractListener3 = fVar.f174801c.getBeautyOnInteractListener()) == null)) {
                        beautyOnInteractListener3.mo22670b(t7, C77918f.m136066a((ComposerBeauty) t7));
                    }
                }
            } else if (!z) {
                if (fVar.mo121571a()) {
                    Iterator<T> it3 = fVar.f174801c.getCategoryAdapter().f174570a.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it3.next();
                        if (C89219l.m154714a((Object) t2, (Object) fVar.f174801c.getCurSelectBeauty())) {
                            break;
                        }
                    }
                    T t8 = t2;
                    if (!(t8 == null || (beautyOnInteractListener2 = fVar.f174801c.getBeautyOnInteractListener()) == null)) {
                        ComposerBeautyExtraBeautify.ItemsBean itemsBean2 = fVar.f174799a.get(beautySeekBar2);
                        if (!(itemsBean2 == null || (tag = itemsBean2.getTag()) == null)) {
                            str = tag;
                        }
                        beautyOnInteractListener2.mo22670b(t8, C89070n.m154516a(str));
                    }
                } else {
                    Iterator<T> it4 = fVar.f174801c.getCategoryAdapter().f174570a.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it4.next();
                        if (C89219l.m154714a((Object) t, (Object) fVar.f174801c.getCurSelectBeauty())) {
                            break;
                        }
                    }
                    T t9 = t;
                    if (!(t9 == null || (beautyOnInteractListener = fVar.f174801c.getBeautyOnInteractListener()) == null)) {
                        beautyOnInteractListener.mo22670b(t9, C77918f.m136066a((ComposerBeauty) t9));
                    }
                }
            }
            C77918f fVar2 = this.f174802a;
            C77920b bVar = new C77920b(fVar2, this.f174803b, percent);
            boolean z2 = fVar2.f174801c.f175232r;
            if (z2) {
                Iterator<T> it5 = fVar2.f174801c.getAlbumAdapter().f174570a.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    T next = it5.next();
                    if (C89219l.m154714a((Object) next, (Object) fVar2.f174801c.getCurSelectAlbumBeauty())) {
                        t5 = next;
                        break;
                    }
                }
                T t10 = t5;
                if (t10 != null) {
                    bVar.mo121575a(t10);
                }
            } else if (!z2) {
                Iterator<T> it6 = fVar2.f174801c.getCategoryAdapter().f174570a.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    T next2 = it6.next();
                    if (C89219l.m154714a((Object) next2, (Object) fVar2.f174801c.getCurSelectBeauty())) {
                        t5 = next2;
                        break;
                    }
                }
                T t11 = t5;
                if (t11 != null) {
                    bVar.mo121575a(t11);
                }
            }
        }

        C77919a(C77918f fVar, BeautySeekBar beautySeekBar) {
            this.f174802a = fVar;
            this.f174803b = beautySeekBar;
        }
    }

    /* renamed from: a */
    public final boolean mo121571a() {
        ComposerBeauty curSelectBeauty;
        ComposerBeautyExtraBeautify beautifyExtra;
        List<ComposerBeautyExtraBeautify.ItemsBean> items;
        if (this.f174801c.f175232r) {
            curSelectBeauty = this.f174801c.getCurSelectAlbumBeauty();
        } else {
            curSelectBeauty = this.f174801c.getCurSelectBeauty();
        }
        if (curSelectBeauty == null || (beautifyExtra = curSelectBeauty.getBeautifyExtra()) == null || (items = beautifyExtra.getItems()) == null || items.size() != 2 || !m136068b()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.f$b */
    static final class C77920b extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77918f f174804a;

        /* renamed from: b */
        final /* synthetic */ BeautySeekBar f174805b;

        /* renamed from: c */
        final /* synthetic */ int f174806c;

        static {
            Covode.recordClassIndex(91009);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77920b(C77918f fVar, BeautySeekBar beautySeekBar, int i) {
            super(1);
            this.f174804a = fVar;
            this.f174805b = beautySeekBar;
            this.f174806c = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            mo121575a(composerBeauty);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo121575a(ComposerBeauty composerBeauty) {
            AbstractC78056f.AbstractC78057a beautyViewListener;
            C89219l.m154721d(composerBeauty, "");
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    float a = C77974h.m136234a(new C77974h.C77975a(t.getDoubleDirection(), this.f174805b.getMaxPercent(), 0, t.getMax(), t.getMin(), 0.0f, this.f174806c, 332));
                    if (this.f174804a.f174800b.mo121615g().mo121555a(composerBeauty) && C77878d.m136004f(composerBeauty) && (beautyViewListener = this.f174804a.f174801c.getBeautyViewListener()) != null) {
                        beautyViewListener.mo121548a(composerBeauty.getEffect().getUnzipPath(), t.getTag(), a / 100.0f);
                    }
                }
                composerBeauty.setProgressValue(this.f174806c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.f$c */
    static final class C77921c extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77918f f174807a;

        /* renamed from: b */
        final /* synthetic */ BeautySeekBar f174808b;

        /* renamed from: c */
        final /* synthetic */ int f174809c;

        static {
            Covode.recordClassIndex(91010);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77921c(C77918f fVar, BeautySeekBar beautySeekBar, int i) {
            super(1);
            this.f174807a = fVar;
            this.f174808b = beautySeekBar;
            this.f174809c = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            mo121576a(composerBeauty);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo121576a(ComposerBeauty composerBeauty) {
            ComposerBeautyExtraBeautify.ItemsBean itemsBean;
            String str = "";
            C89219l.m154721d(composerBeauty, str);
            if (!this.f174807a.mo121571a()) {
                List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
                if (!(items == null || items.isEmpty() || items == null)) {
                    for (T t : items) {
                        float a = C77974h.m136234a(new C77974h.C77975a(t.getDoubleDirection(), this.f174808b.getMaxPercent(), 0, t.getMax(), t.getMin(), 0.0f, this.f174809c, 332));
                        this.f174807a.f174800b.mo121602b(composerBeauty, t.getTag(), a);
                        C77971n<BeautyComposerInfo> d = this.f174807a.f174800b.mo121609d();
                        String str2 = composerBeauty.getEffect().getUnzipPath() + ':' + t.getTag() + ':' + (a / 100.0f);
                        String extra = composerBeauty.getEffect().getExtra();
                        if (extra == null) {
                            extra = str;
                        }
                        d.add(new BeautyComposerInfo(str2, extra, composerBeauty.getEffect().getEffectId()));
                        if (C77878d.m135999b(composerBeauty)) {
                            this.f174807a.f174800b.mo121616g(composerBeauty);
                        } else {
                            this.f174807a.f174800b.mo121614f(composerBeauty);
                        }
                    }
                    return;
                }
                return;
            }
            List<ComposerBeautyExtraBeautify.ItemsBean> items2 = composerBeauty.getBeautifyExtra().getItems();
            if (items2 != null && items2.size() >= 2 && (itemsBean = this.f174807a.f174799a.get(this.f174808b)) != null) {
                C89219l.m154716b(itemsBean, str);
                float a2 = C77974h.m136234a(new C77974h.C77975a(itemsBean.getDoubleDirection(), this.f174808b.getMaxPercent(), 0, itemsBean.getMax(), itemsBean.getMin(), 0.0f, this.f174809c, 332));
                this.f174807a.f174800b.mo121602b(composerBeauty, itemsBean.getTag(), a2);
                C77971n<BeautyComposerInfo> d2 = this.f174807a.f174800b.mo121609d();
                String str3 = composerBeauty.getEffect().getUnzipPath() + ':' + itemsBean.getTag() + ':' + (a2 / 100.0f);
                String extra2 = composerBeauty.getEffect().getExtra();
                if (extra2 != null) {
                    str = extra2;
                }
                d2.add(new BeautyComposerInfo(str3, str, composerBeauty.getEffect().getEffectId()));
                if (C77878d.m135999b(composerBeauty)) {
                    this.f174807a.f174800b.mo121616g(composerBeauty);
                } else {
                    this.f174807a.f174800b.mo121614f(composerBeauty);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.f$d */
    public static final class C77922d implements AbstractC77967m.AbstractC77970c {

        /* renamed from: a */
        final /* synthetic */ C77918f f174810a;

        static {
            Covode.recordClassIndex(91011);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C77922d(C77918f fVar) {
            this.f174810a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m.AbstractC77970c
        /* renamed from: a */
        public final void mo121567a(List<BeautyComposerInfo> list) {
            C89219l.m154721d(list, "");
            if (this.f174810a.f174801c.getViewConfig().f174735m) {
                BeautySwitchView swEnableBeauty = this.f174810a.f174801c.getSwEnableBeauty();
                C89219l.m154716b(swEnableBeauty, "");
                if (!swEnableBeauty.f175182b) {
                    return;
                }
            }
            AbstractC78056f.AbstractC78057a beautyViewListener = this.f174810a.f174801c.getBeautyViewListener();
            if (beautyViewListener != null) {
                beautyViewListener.mo121549a(list, 10000);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m.AbstractC77970c
        /* renamed from: a */
        public final void mo121568a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(list2, "");
            if (this.f174810a.f174801c.getViewConfig().f174735m) {
                BeautySwitchView swEnableBeauty = this.f174810a.f174801c.getSwEnableBeauty();
                C89219l.m154716b(swEnableBeauty, "");
                if (!swEnableBeauty.f175182b) {
                    return;
                }
            }
            AbstractC78056f.AbstractC78057a beautyViewListener = this.f174810a.f174801c.getBeautyViewListener();
            if (beautyViewListener != null) {
                beautyViewListener.mo121550a(list, list2, 10000);
            }
        }
    }

    /* renamed from: a */
    static List<String> m136066a(ComposerBeauty composerBeauty) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getTag());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo121570a(BeautySeekBar beautySeekBar) {
        C89219l.m154721d(beautySeekBar, "");
        C77864g gVar = this.f174801c.getViewConfig().f174692d;
        Resources resources = this.f174801c.getResources();
        int i = gVar.f174703c;
        Context context = this.f174801c.getContext();
        C89219l.m154716b(context, "");
        int b = C0637f.m2349b(resources, i, context.getTheme());
        Resources resources2 = this.f174801c.getResources();
        int i2 = gVar.f174704d;
        Context context2 = this.f174801c.getContext();
        C89219l.m154716b(context2, "");
        int b2 = C0637f.m2349b(resources2, i2, context2.getTheme());
        Resources resources3 = this.f174801c.getResources();
        int i3 = gVar.f174705e;
        Context context3 = this.f174801c.getContext();
        C89219l.m154716b(context3, "");
        beautySeekBar.mo121790a(b, b2, C0637f.m2349b(resources3, i3, context3.getTheme()));
        beautySeekBar.setDefaultCircleConfig(gVar.f174706f);
        beautySeekBar.setSuggestCircleColor(gVar.f174707g);
        Context context4 = beautySeekBar.getContext();
        C89219l.m154716b(context4, "");
        beautySeekBar.setBarHeight(C84912r.m145930a(context4, gVar.f174708h));
        Context context5 = beautySeekBar.getContext();
        C89219l.m154716b(context5, "");
        float f = gVar.f174709i;
        Resources resources4 = context5.getResources();
        C89219l.m154716b(resources4, "");
        beautySeekBar.setTextSize(TypedValue.applyDimension(2, f, resources4.getDisplayMetrics()));
        Context context6 = beautySeekBar.getContext();
        C89219l.m154716b(context6, "");
        beautySeekBar.setBarPadding(C84912r.m145930a(context6, gVar.f174710j));
        beautySeekBar.setOnLevelChangeListener(new C77919a(this, beautySeekBar));
    }

    public C77918f(AbstractC77967m mVar, ComposerBeautyViewImpl composerBeautyViewImpl) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(composerBeautyViewImpl, "");
        this.f174800b = mVar;
        this.f174801c = composerBeautyViewImpl;
    }

    /* renamed from: a */
    private static void m136067a(ComposerBeautyExtraBeautify.ItemsBean itemsBean, BeautySeekBar beautySeekBar) {
        C77974h.C77975a b = C77974h.m136235b(new C77974h.C77975a(itemsBean.getDoubleDirection(), 100, 0, itemsBean.getMax(), itemsBean.getMin(), (float) itemsBean.getValue(), 0, 396));
        if (itemsBean.getDoubleDirection() || b.f174916h != 0) {
            beautySeekBar.setNeedShowSuggestCircle(true);
        } else {
            beautySeekBar.setNeedShowSuggestCircle(false);
        }
        beautySeekBar.setSuggestPercent(b.f174916h);
    }

    /* renamed from: a */
    public final void mo121569a(ComposerBeauty composerBeauty, boolean z, boolean z2) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items;
        ComposerBeautyExtraBeautify.ItemsBean itemsBean;
        C89219l.m154721d(composerBeauty, "");
        if (z) {
            this.f174800b.mo121587a(composerBeauty, new C77922d(this));
        }
        if (z2) {
            List<ComposerBeautyExtraBeautify.ItemsBean> items2 = composerBeauty.getBeautifyExtra().getItems();
            if (items2 != null && (!items2.isEmpty())) {
                C77974h.C77975a b = C77974h.m136235b(new C77974h.C77975a(items2.get(0).getDoubleDirection(), 100, 0, items2.get(0).getMax(), items2.get(0).getMin(), this.f174800b.mo121583a(composerBeauty, items2.get(0).getTag(), (float) items2.get(0).getValue()), 0, 396));
                if (items2.get(0).getDoubleDirection()) {
                    this.f174801c.getPbProgressBar().mo121791a(50, -50, false);
                } else {
                    this.f174801c.getPbProgressBar().mo121791a(100, 0, true);
                }
                this.f174801c.getPbProgressBar().setPercent(b.f174916h);
                if (!m136068b() || items2.get(0).getName().length() <= 0) {
                    this.f174801c.getTvFirstPbTitle().setVisibility(8);
                } else {
                    this.f174801c.getTvFirstPbTitle().setVisibility(0);
                    this.f174801c.getTvFirstPbTitle().setText(items2.get(0).getName());
                }
                this.f174801c.getTvSecondPbTitle().setVisibility(8);
                List<ComposerBeautyExtraBeautify.ItemsBean> items3 = composerBeauty.getBeautifyExtra().getItems();
                if (!(items3 == null || (itemsBean = (ComposerBeautyExtraBeautify.ItemsBean) C89070n.m154579f((List) items3)) == null)) {
                    m136067a(itemsBean, this.f174801c.getPbProgressBar());
                }
            }
            if (mo121571a() && (items = composerBeauty.getBeautifyExtra().getItems()) != null && items.size() >= 2) {
                C77974h.C77975a b2 = C77974h.m136235b(new C77974h.C77975a(items.get(1).getDoubleDirection(), 100, 0, items.get(1).getMax(), items.get(1).getMin(), this.f174800b.mo121583a(composerBeauty, items.get(1).getTag(), (float) items.get(1).getValue()), 0, 396));
                if (items.get(1).getDoubleDirection()) {
                    this.f174801c.getSecondPbProgressBar().mo121791a(50, -50, false);
                } else {
                    this.f174801c.getSecondPbProgressBar().mo121791a(100, 0, true);
                }
                this.f174801c.getSecondPbProgressBar().setPercent(b2.f174916h);
                if (!m136068b() || items.get(1).getName().length() <= 0) {
                    this.f174801c.getTvSecondPbTitle().setVisibility(8);
                } else {
                    this.f174801c.getTvSecondPbTitle().setVisibility(0);
                    this.f174801c.getTvSecondPbTitle().setText(items.get(1).getName());
                }
                m136067a(items.get(1), this.f174801c.getSecondPbProgressBar());
                this.f174799a.put(this.f174801c.getPbProgressBar(), items.get(0));
                this.f174799a.put(this.f174801c.getSecondPbProgressBar(), items.get(1));
            }
        }
    }
}
