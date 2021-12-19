package com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.metrics.C59213ah;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordPermissionActivity;
import com.p2082ss.android.ugc.aweme.tools.draft.C78178ay;
import com.p2082ss.android.ugc.aweme.tools.draft.p4100a.AbstractC78124a;
import com.p2082ss.android.ugc.aweme.tools.draft.p4104e.C78245a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.f */
public final class C78285f extends AbstractC78124a<C43223c> {

    /* renamed from: f */
    public static final C78286a f175845f = new C78286a((byte) 0);

    /* renamed from: a */
    TextView f175846a;

    /* renamed from: b */
    TextView f175847b;

    /* renamed from: c */
    public boolean f175848c;

    /* renamed from: d */
    public final Context f175849d;

    /* renamed from: e */
    final boolean f175850e;

    static {
        Covode.recordClassIndex(91402);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.f$a */
    public static final class C78286a {
        static {
            Covode.recordClassIndex(91403);
        }

        private C78286a() {
        }

        public /* synthetic */ C78286a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.f$b */
    static final class View$OnClickListenerC78287b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78285f f175851a;

        /* renamed from: b */
        final /* synthetic */ C43223c f175852b;

        static {
            Covode.recordClassIndex(91404);
        }

        View$OnClickListenerC78287b(C78285f fVar, C43223c cVar) {
            this.f175851a = fVar;
            this.f175852b = cVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.f$b$a */
        static final class C78290a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            public static final C78290a f175857a = new C78290a();

            static {
                Covode.recordClassIndex(91407);
            }

            C78290a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                C63238c.f143581h.mo101743a();
                return C89391z.f203057a;
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154721d(view, "");
            C70005cr.m123611a();
            if (C70005cr.m123613a(view.getContext())) {
                AbstractC63154aa b = C63253l.f143623a.mo73306b();
                C69905c cVar = this.f175852b.f100906f;
                C89219l.m154716b(cVar, "");
                if (b.mo101747a(cVar, this.f175851a.f175849d, true)) {
                    View view2 = this.f175851a.itemView;
                    C89219l.m154716b(view2, "");
                    Context context = view2.getContext();
                    Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    final ActivityC0945e eVar = (ActivityC0945e) context;
                    final ProgressDialog a = C78245a.m136731a(eVar, C78290a.f175857a);
                    C78178ay.m136667a(eVar, this.f175852b, new AbstractC89183m<Boolean, String, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.C78285f.View$OnClickListenerC78287b.C782881 */

                        /* renamed from: a */
                        final /* synthetic */ View$OnClickListenerC78287b f175853a;

                        static {
                            Covode.recordClassIndex(91405);
                        }

                        {
                            this.f175853a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89183m
                        public final /* synthetic */ C89391z invoke(Boolean bool, String str) {
                            if (!bool.booleanValue()) {
                                new C79459a(eVar).mo123050a(R.string.dau).mo123053a();
                            } else if (C40964c.C40968c.f95804a.mo70144a()) {
                                C84911q.m145928d("app is running background");
                            } else {
                                C69905c clone = this.f175853a.f175852b.f100906f.clone();
                                if (clone != null) {
                                    clone.setMusicPriority(99);
                                    C70005cr.m123611a().mo70083a(clone);
                                    String str2 = this.f175853a.f175852b.f100908h;
                                    int i = this.f175853a.f175852b.f100914n;
                                    C40970e.m82485a("toVideoRecord() called with: path = [" + str2 + "], context = [], musicModel = [" + clone + "], start = [" + i + "]");
                                    try {
                                        new JSONObject().put("route", "1");
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                    C59213ah.f134852a = "draft_page";
                                    ActivityC0945e eVar = eVar;
                                    String musicId = clone.getMusicId();
                                    C89219l.m154716b(musicId, "");
                                    C89219l.m154716b(str2, "");
                                    String uuid = UUID.randomUUID().toString();
                                    C89219l.m154716b(uuid, "");
                                    C80322d.m139251a("shoot", new C84425b().mo129406a("creation_id", uuid).mo129406a("shoot_way", "edit_draft").mo129406a("music_id", musicId).mo129407a("is_ui_shoot", false).f188764a);
                                    C40970e.m82485a("toVideoActivity() called with: context = [ ], path = [" + str2 + "], musicStart = [" + i + "]");
                                    Intent intent = new Intent();
                                    intent.putExtra("path", str2);
                                    intent.putExtra("music_start", i);
                                    intent.putExtra("record_from", 1);
                                    intent.putExtra("translation_type", 3);
                                    intent.putExtra("shoot_way", "draft_again");
                                    intent.putExtra("creation_id", uuid);
                                    C70005cr.m123611a().mo110456f();
                                    intent.setClass(eVar, VideoRecordPermissionActivity.class);
                                    C84349a.m145093a(intent, eVar);
                                    eVar.startActivity(intent);
                                }
                            }
                            return C89391z.f203057a;
                        }
                    }, new AbstractC89171a<C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.C78285f.View$OnClickListenerC78287b.C782892 */

                        /* renamed from: a */
                        final /* synthetic */ View$OnClickListenerC78287b f175855a;

                        static {
                            Covode.recordClassIndex(91406);
                        }

                        {
                            this.f175855a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            ProgressDialog progressDialog = a;
                            if (progressDialog != null) {
                                progressDialog.dismiss();
                            }
                            return C89391z.f203057a;
                        }
                    }).mo122037a();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78285f(boolean z, View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f175850e = z;
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f175849d = context;
        View c = C0792v.m2762c(view, (int) R.id.ezt);
        C89219l.m154716b(c, "");
        this.f175846a = (TextView) c;
        View c2 = C0792v.m2762c(view, (int) R.id.es1);
        C89219l.m154716b(c2, "");
        TextView textView = (TextView) c2;
        this.f175847b = textView;
        if (textView == null) {
            C89219l.m154710a("mNext");
        }
        TextView textView2 = this.f175847b;
        if (textView2 == null) {
            C89219l.m154710a("mNext");
        }
        textView.setPadding(textView2.getPaddingLeft(), 0, 0, 0);
        TextView textView3 = this.f175847b;
        if (textView3 == null) {
            C89219l.m154710a("mNext");
        }
        ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) C13628n.m24520b(context, 16.0f), (int) C13628n.m24520b(context, 16.0f), (int) C13628n.m24520b(context, 8.0f));
        int i = Build.VERSION.SDK_INT;
        marginLayoutParams.setMarginEnd((int) C13628n.m24520b(context, 16.0f));
        TextView textView4 = this.f175847b;
        if (textView4 == null) {
            C89219l.m154710a("mNext");
        }
        textView4.setLayoutParams(marginLayoutParams);
    }
}
