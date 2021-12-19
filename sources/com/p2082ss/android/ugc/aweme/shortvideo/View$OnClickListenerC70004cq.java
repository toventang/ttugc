package com.p2082ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.share.C68876b;
import com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72630h;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cq */
public class View$OnClickListenerC70004cq extends Fragment implements View.OnClickListener, AbstractC74304x<C69831ai> {

    /* renamed from: a */
    protected CircularProgressView f156471a;

    /* renamed from: b */
    protected TextView f156472b;

    /* renamed from: c */
    public AbstractC72630h f156473c;

    /* renamed from: d */
    public View f156474d;

    /* renamed from: e */
    public boolean f156475e;

    /* renamed from: f */
    private int f156476f;

    /* renamed from: g */
    private boolean f156477g;

    /* renamed from: h */
    private MainActivity f156478h;

    static {
        Covode.recordClassIndex(82418);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public void onParallelPublishCancel() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public void onParallelPublishPause() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public void onParallelPublishResume() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public void onSynthetiseSuccess(String str) {
    }

    /* renamed from: b */
    public final void mo110447b() {
        requireFragmentManager().mo3552a().mo3471b(this).mo3473c();
    }

    /* renamed from: c */
    private void m123608c() {
        if (getFragmentManager() != null) {
            getFragmentManager().mo3552a().mo3455a(this).mo3473c();
        }
    }

    /* renamed from: a */
    public final void mo110446a() {
        requireFragmentManager().mo3552a().mo3451a(R.anim.ds, R.anim.dt).mo3474c(this).mo3473c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (getActivity() != null) {
            C69488a.C69489a.m122709a(getActivity()).mo109736a("upload_progress_fragment", false);
        }
        m123608c();
        super.onDestroy();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public void onError(C71818ev evVar) {
        this.f156477g = false;
        m123608c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MainActivity) {
            this.f156478h = (MainActivity) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            C69488a.C69489a.m122709a(getActivity()).mo109736a("upload_progress_fragment", true);
        }
    }

    /* renamed from: a */
    private void m123607a(int i) {
        CircularProgressView circularProgressView = this.f156471a;
        if (circularProgressView != null) {
            circularProgressView.setProgress((float) i);
            this.f156472b.setText(i + "%");
        }
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (this.f156478h != null && this.f156473c != null) {
            C39162r.m79460a("click_publishing_toast", new C33744d().mo59983a("creation_id", this.f156473c.mo101828e()).mo59980a("video_type", this.f156473c.mo101824b()).mo59983a("enter_from", this.f156478h.getEnterFrom()).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public void onProgressUpdate(int i, boolean z) {
        this.f156476f = i;
        m123607a(i);
        if (z && !this.f156477g) {
            this.f156477g = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        CircularProgressView circularProgressView = (CircularProgressView) view.findViewById(R.id.bxi);
        this.f156471a = circularProgressView;
        circularProgressView.setIndeterminate(false);
        this.f156472b = (TextView) view.findViewById(R.id.d_3);
        View findViewById = view.findViewById(R.id.dnb);
        this.f156474d = findViewById;
        findViewById.setOnClickListener(this);
        if (getActivity() != null) {
            C69488a.C69489a.m122709a(getActivity()).mo109736a("upload_progress_fragment", true);
        }
        m123607a(this.f156476f);
        if (this.f156478h != null && this.f156473c != null) {
            C39162r.m79460a("publishing_toast_show", new C33744d().mo59983a("creation_id", this.f156473c.mo101828e()).mo59980a("video_type", this.f156473c.mo101824b()).mo59983a("enter_from", this.f156478h.getEnterFrom()).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public void onSuccess(C69831ai aiVar, boolean z) {
        this.f156477g = false;
        if (aiVar instanceof CreateAwemeResponse) {
            C68876b bVar = new C68876b(this);
            Aweme aweme = ((CreateAwemeResponse) aiVar).aweme;
            if (!SharePrefCache.inst().getIsAwemePrivate().mo59941c().booleanValue()) {
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    if (SharePrefCache.inst().getAutoSendTwitter().mo59941c().booleanValue()) {
                        arrayList.add(2);
                        jSONArray.put("twitter");
                    }
                    jSONObject.put("platform", jSONArray);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(",");
                }
                if (arrayList.size() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                C39162r.onEvent(MobClick.obtain().setJsonObject(jSONObject).setEventName("sync_video").setLabelName("edit_page"));
                if (!TextUtils.isEmpty(sb)) {
                    bVar.f154052a.mo57616a(sb.toString(), aweme.getShareInfo().getShareUrl(), aweme.getShareInfo().getShareTitle(), SharePrefCache.inst().getFacebookAccessToken().mo59941c(), SharePrefCache.inst().getTwitterAccessToken().mo59941c(), SharePrefCache.inst().getTwitterSecret().mo59941c(), SharePrefCache.inst().getGoogleServerAuthCode().mo59941c(), aweme.getAid(), aweme.getShareInfo().getShareTitle(), "");
                }
                SharePrefCache.inst().getIsAwemePrivate().mo59940b(false);
            }
        }
        m123608c();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.a1d, viewGroup, false);
    }
}
