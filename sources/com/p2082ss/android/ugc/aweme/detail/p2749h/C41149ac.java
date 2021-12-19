package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.MarqueeView2;
import com.p2082ss.android.ugc.aweme.experiment.C46847dp;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.detail.h.ac */
public final class C41149ac extends AbstractC41220y {

    /* renamed from: a */
    private List<C75445g> f96160a;

    /* renamed from: bx */
    private String f96161bx;

    /* renamed from: by */
    private View f96162by;

    static {
        Covode.recordClassIndex(49032);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: o */
    public final int mo70389o() {
        return R.string.h4g;
    }

    /* renamed from: ab */
    private C75445g m82855ab() {
        List<C75445g> list = this.f96160a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.f96160a.get(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.C33403c.AbstractC33409e, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b, com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    public final void bs_() {
        View view;
        super.bs_();
        if (C33403c.f79378n == 0 && (view = this.f96162by) != null) {
            view.setBackgroundColor(C0643b.m2378c(this.f183419bv, R.color.h));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: n */
    public final void mo70388n() {
        String str;
        int i = 0;
        if (this.f183419bv == null || !MSAdaptionService.m97895c().mo89375b(this.f183419bv)) {
            IPropReuseService c = PropReuseServiceImpl.m116994c();
            if (m82855ab() != null) {
                Aweme aD = mo81109aD();
                String str2 = "";
                Music music = null;
                if (aD != null) {
                    music = aD.getMusic();
                    str = aD.getAid();
                    if (C46847dp.m90162a() && !C80580in.m139689d() && Aweme.containsGreenScreenGiphyAnchor(aD.getAnchors())) {
                        str2 = aD.getGiphyGifIds();
                    }
                    if (aD.getVideo() != null) {
                        i = aD.getVideo().getVideoLength();
                    }
                } else {
                    str = null;
                    i = 0;
                }
                c.mo104482a(this.f183419bv, new ArrayList<>(this.f96160a), str2, music, this.f114782aJ.getPreviousPage(), str, i, AVExternalServiceImpl.m113114a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera());
                return;
            }
            return;
        }
        Toast makeText = Toast.makeText(this.f183419bv, this.f183419bv.getString(R.string.bed), 0);
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(makeText);
        }
        makeText.show();
    }

    public C41149ac(Bundle bundle) {
        this.f96160a = (List) bundle.getSerializable("feed_data_sticker_model");
        this.f96161bx = bundle.getString("feed_data_sticker_group_id", "");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: a */
    public final View mo70386a(RelativeLayout relativeLayout) {
        View a = C1764a.m5927a(LayoutInflater.from(this.f183419bv), R.layout.wr, relativeLayout, false);
        this.f96162by = a.findViewById(R.id.e8z);
        C75445g ab = m82855ab();
        if (ab != null) {
            C34577e.m70592a((RemoteImageView) a.findViewById(R.id.e8y), ab.iconUrl);
            mo70549a((MarqueeView2) a.findViewById(R.id.b0s), ab.name);
        }
        return a;
    }
}
