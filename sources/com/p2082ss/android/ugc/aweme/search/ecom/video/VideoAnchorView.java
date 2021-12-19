package com.p2082ss.android.ugc.aweme.search.ecom.video;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67394a;
import com.p2082ss.android.ugc.aweme.utils.C80291cb;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.ecom.video.VideoAnchorView */
public final class VideoAnchorView extends LinearLayout {

    /* renamed from: a */
    private SmartImageView f151061a;

    /* renamed from: b */
    private TextView f151062b;

    /* renamed from: c */
    private Aweme f151063c;

    /* renamed from: d */
    private C67394a f151064d;

    static {
        Covode.recordClassIndex(79061);
    }

    public VideoAnchorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final C67394a getCurProduct() {
        return this.f151064d;
    }

    /* renamed from: a */
    private final String m119459a(C67394a aVar, int i) {
        if (i <= 0) {
            return null;
        }
        if (i != 1) {
            return getResources().getQuantityString(R.plurals.ip, i, Integer.valueOf(i));
        } else if (aVar == null) {
            return null;
        } else {
            String str = aVar.f150988d;
            if (str == null || str.length() <= 0) {
                return aVar.f150986b;
            }
            return str;
        }
    }

    /* renamed from: a */
    public final boolean mo106340a(Aweme aweme, C67427a aVar) {
        List<C67394a> list;
        C67394a aVar2;
        String str;
        int i;
        C89219l.m154721d(aweme, "");
        if (aVar == null || (list = aVar.f151066b) == null || (aVar2 = (C67394a) C89070n.m154583g((List) list)) == null || (str = aVar2.f150985a) == null || str.length() <= 0) {
            C11279p.m20006a(this);
            return false;
        }
        this.f151064d = aVar2;
        this.f151063c = aweme;
        UrlModel urlModel = aVar.f151065a;
        C67394a aVar3 = this.f151064d;
        Aweme aweme2 = this.f151063c;
        if (aweme2 != null) {
            i = aweme2.getTotalProductAnchors();
        } else {
            i = 0;
        }
        String a = m119459a(aVar3, i);
        if (urlModel == null || a == null) {
            C11279p.m20006a(this);
            return false;
        }
        C11279p.m20017b(this);
        C20766v a2 = C20761r.m39060a(C34735v.m70965a(urlModel));
        a2.f49092E = this.f151061a;
        a2.mo34186c();
        TextView textView = this.f151062b;
        if (textView != null) {
            textView.setText(a);
        }
        return true;
    }

    private /* synthetic */ VideoAnchorView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private VideoAnchorView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8261);
        LinearLayout.inflate(context, R.layout.awo, this);
        this.f151061a = (SmartImageView) findViewById(R.id.fbv);
        this.f151062b = (TextView) findViewById(R.id.fbw);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        float applyDimension = TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics());
        setBackground(C80291cb.m139200a(C0643b.m2378c(context, R.color.a4), 0.0f, 0.0f, applyDimension, applyDimension));
        MethodCollector.m26664o(8261);
    }
}
