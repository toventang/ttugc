package com.p2082ss.android.ugc.aweme.p3629q.p3633b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.AbstractC34884bl;
import com.p2082ss.android.ugc.aweme.api.model.AnchorCell;
import com.p2082ss.android.ugc.aweme.api.model.AnchorIcon;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.AnchorListManager;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.C37609a;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3629q.p3630a.AbstractC65728a;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.q.b.a */
public final class C65755a extends AbstractC65728a<AnchorCell, C65756a> {

    /* renamed from: d */
    public final String f148146d;

    static {
        Covode.recordClassIndex(77254);
    }

    /* renamed from: com.ss.android.ugc.aweme.q.b.a$a */
    public final class C65756a extends AbstractC65728a<AnchorCell, C65756a>.C65732c {

        /* renamed from: b */
        public final SmartImageView f148147b;

        /* renamed from: c */
        public final TextView f148148c;

        /* renamed from: d */
        public final Button f148149d;

        /* renamed from: e */
        final /* synthetic */ C65755a f148150e;

        static {
            Covode.recordClassIndex(77255);
        }

        /* renamed from: com.ss.android.ugc.aweme.q.b.a$a$a */
        static final class View$OnClickListenerC65757a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C65756a f148151a;

            /* renamed from: b */
            final /* synthetic */ AnchorCell f148152b;

            static {
                Covode.recordClassIndex(77256);
            }

            View$OnClickListenerC65757a(C65756a aVar, AnchorCell anchorCell) {
                this.f148151a = aVar;
                this.f148152b = anchorCell;
            }

            public final void onClick(View view) {
                Collection<AnchorPublishStruct> values;
                T t;
                ClickAgent.onClick(view);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("third_id", this.f148152b.f79655a);
                    jSONObject.put("add_from", 2);
                    jSONObject.put("common_type", true);
                    String str = this.f148152b.f79660f;
                    if (str != null) {
                        Object a = new C27910f().mo46670a(str, Map.class);
                        C89219l.m154716b(a, "");
                        for (Map.Entry entry : ((Map) a).entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                } catch (JSONException e) {
                    C51423a.m95786a((Exception) e);
                }
                AbstractC34884bl blVar = this.f148151a.f148150e.f148117b;
                String str2 = null;
                String d = blVar != null ? blVar.mo59601d() : null;
                AbstractC34884bl blVar2 = this.f148151a.f148150e.f148117b;
                String e2 = blVar2 != null ? blVar2.mo59602e() : null;
                Map<String, AnchorPublishStruct> d2 = AnchorListManager.m70438d();
                if (!(d2 == null || (values = d2.values()) == null)) {
                    Iterator<T> it = values.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (t.type == this.f148152b.f79661g) {
                            break;
                        }
                    }
                    T t2 = t;
                    if (t2 != null) {
                        str2 = t2.logExtra;
                    }
                }
                C33744d dVar = new C33744d();
                dVar.mo59983a("anchor_entry", this.f148152b.f79657c).mo59983a("enter_from", "video_post_page").mo59983a("shoot_way", d).mo59983a("creation_id", e2).mo59980a("status", 1);
                if (!(str2 == null || str2.length() == 0)) {
                    JSONObject jSONObject2 = new JSONObject(str2);
                    Iterator<String> keys = jSONObject2.keys();
                    C89219l.m154716b(keys, "");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        dVar.mo59983a(next, jSONObject2.get(next).toString());
                    }
                }
                C39162r.m79460a("choose_anchor", dVar.f79943a);
                int i = this.f148152b.f79661g;
                String jSONObject3 = jSONObject.toString();
                C89219l.m154716b(jSONObject3, "");
                AbstractC81915c.m141874a(new C37609a(new C39053a(i, jSONObject3, this.f148152b.f79657c, null, 1, null, null, false, null, null, null, null, null, 8168, null)));
                AbstractC34884bl blVar3 = this.f148151a.f148150e.f148117b;
                if (blVar3 != null) {
                    blVar3.mo59600c();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65756a(C65755a aVar, View view) {
            super(aVar, view, aVar.f148146d);
            C89219l.m154721d(view, "");
            this.f148150e = aVar;
            this.f148147b = (SmartImageView) view.findViewById(R.id.bgg);
            this.f148148c = (TextView) view.findViewById(R.id.ern);
            this.f148149d = (Button) view.findViewById(R.id.x0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65755a(AbstractC34884bl blVar, String str) {
        super(blVar);
        C89219l.m154721d(str, "");
        this.f148146d = str;
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ RecyclerView.ViewHolder mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a97, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C65756a(this, a);
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(RecyclerView.ViewHolder viewHolder, Object obj) {
        String str;
        ArrayList<String> arrayList;
        C65756a aVar = (C65756a) viewHolder;
        AnchorCell anchorCell = (AnchorCell) obj;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(anchorCell, "");
        C89219l.m154721d(anchorCell, "");
        AnchorIcon anchorIcon = anchorCell.f79656b;
        if (anchorIcon == null || (arrayList = anchorIcon.f79664b) == null || (str = arrayList.get(0)) == null) {
            str = "";
        }
        C20766v a = C20761r.m39061a(str);
        a.f49092E = aVar.f148147b;
        a.mo34186c();
        TextView textView = aVar.f148148c;
        C89219l.m154716b(textView, "");
        textView.setText(anchorCell.f79657c);
        aVar.f148149d.setOnClickListener(new C65756a.View$OnClickListenerC65757a(aVar, anchorCell));
    }
}
