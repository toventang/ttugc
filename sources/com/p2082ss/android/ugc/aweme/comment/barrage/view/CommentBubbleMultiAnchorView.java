package com.p2082ss.android.ugc.aweme.comment.barrage.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.BubbleMultiTagLayout;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36177d;
import com.p2082ss.android.ugc.aweme.feed.assem.C48342a;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.CommentBubbleMultiAnchorView */
public class CommentBubbleMultiAnchorView extends FrameLayout {

    /* renamed from: a */
    public BubbleMultiTagLayout f85998a;

    /* renamed from: b */
    private String f85999b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.CommentBubbleMultiAnchorView$a */
    public static final class C36366a<T> implements AbstractC49691s {

        /* renamed from: a */
        public static final C36366a f86000a = new C36366a();

        static {
            Covode.recordClassIndex(43655);
        }

        C36366a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo63634a(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(43654);
    }

    public CommentBubbleMultiAnchorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final String getMEventType() {
        return this.f85999b;
    }

    /* access modifiers changed from: protected */
    public final void setMEventType(String str) {
        this.f85999b = str;
    }

    /* renamed from: a */
    public final void mo63631a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        this.f85998a.setRootBackgroundDrawable(null);
        this.f85998a.setOnInternalEventListener(C36366a.f86000a);
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) anchors, 10));
            for (T t : anchors) {
                int type = t.getType();
                Map map = (Map) C36177d.f85457b.getValue();
                UrlModel urlModel = map != null ? (UrlModel) map.get(Integer.valueOf(type)) : null;
                t.setNewStyleBubbleIcon(urlModel);
                arrayList.add(urlModel);
            }
        }
        BubbleMultiTagLayout bubbleMultiTagLayout = this.f85998a;
        Activity activity = (Activity) getContext();
        if (activity == null) {
            C89219l.m154715b();
        }
        JSONObject jSONObject = new JSONObject();
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d("personal_homepage", "");
        C89219l.m154721d(jSONObject, "");
        if (bubbleMultiTagLayout.f85991a.mo61334a(aweme, activity, "personal_homepage", jSONObject, bubbleMultiTagLayout.f85992b, true, bubbleMultiTagLayout) == 0) {
            C89393b.m154949a(this);
            this.f85998a.mo59613c();
            return;
        }
        C89393b.m154951c(this);
        BubbleMultiTagLayout bubbleMultiTagLayout2 = this.f85998a;
        if (C48342a.f112042a) {
            C58254p.m105190a().post(new BubbleMultiTagLayout.RunnableC36363a(bubbleMultiTagLayout2));
            C58254p.m105190a().post(new BubbleMultiTagLayout.RunnableC36364b(bubbleMultiTagLayout2));
            C58254p.m105190a().post(new BubbleMultiTagLayout.RunnableC36365c(bubbleMultiTagLayout2));
            return;
        }
        bubbleMultiTagLayout2.mo63625a();
        bubbleMultiTagLayout2.mo59613c();
        if (bubbleMultiTagLayout2.f85991a.mo61336a()) {
            bubbleMultiTagLayout2.setVisibility(0);
            bubbleMultiTagLayout2.f85991a.mo61337b(bubbleMultiTagLayout2);
        }
    }

    private /* synthetic */ CommentBubbleMultiAnchorView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommentBubbleMultiAnchorView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9222);
        FrameLayout.inflate(context, R.layout.i2, this);
        View findViewById = findViewById(R.id.a97);
        C89219l.m154716b(findViewById, "");
        this.f85998a = (BubbleMultiTagLayout) findViewById;
        MethodCollector.m26664o(9222);
    }
}
