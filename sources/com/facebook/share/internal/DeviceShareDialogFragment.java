package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.C24915r;
import com.facebook.EnumC24916s;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.C24699ae;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1858e.p1859a.C24266a;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class DeviceShareDialogFragment extends DialogInterface$OnCancelListenerC0944d {

    /* renamed from: g */
    private static ScheduledThreadPoolExecutor f59183g;

    /* renamed from: a */
    public Dialog f59184a;

    /* renamed from: b */
    public ShareContent f59185b;

    /* renamed from: c */
    private ProgressBar f59186c;

    /* renamed from: d */
    private TextView f59187d;

    /* renamed from: e */
    private volatile RequestState f59188e;

    /* renamed from: f */
    private volatile ScheduledFuture f59189f;

    static {
        Covode.recordClassIndex(30231);
    }

    /* access modifiers changed from: package-private */
    public static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new Parcelable.Creator<RequestState>() {
            /* class com.facebook.share.internal.DeviceShareDialogFragment.RequestState.C249331 */

            static {
                Covode.recordClassIndex(30236);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ RequestState[] newArray(int i) {
                return new RequestState[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ RequestState createFromParcel(Parcel parcel) {
                return new RequestState(parcel);
            }
        };

        /* renamed from: a */
        public String f59193a;

        /* renamed from: b */
        public long f59194b;

        public int describeContents() {
            return 0;
        }

        RequestState() {
        }

        static {
            Covode.recordClassIndex(30235);
        }

        protected RequestState(Parcel parcel) {
            this.f59193a = parcel.readString();
            this.f59194b = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f59193a);
            parcel.writeLong(this.f59194b);
        }
    }

    /* renamed from: a */
    private void m47785a() {
        if (isAdded()) {
            getFragmentManager().mo3552a().mo3455a(this).mo3467b();
        }
    }

    /* renamed from: b */
    private static synchronized ScheduledThreadPoolExecutor m47788b() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceShareDialogFragment.class) {
            MethodCollector.m26663i(5716);
            if (f59183g == null) {
                f59183g = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f59183g;
            MethodCollector.m26664o(5716);
        }
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: a */
    private static void m47787a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(toast);
        }
        toast.show();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f59188e != null) {
            bundle.putParcelable("request_state", this.f59188e);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f59189f != null) {
            this.f59189f.cancel(true);
        }
        m47786a(new Intent());
    }

    /* renamed from: a */
    private void m47786a(Intent intent) {
        if (this.f59188e != null) {
            C24266a.m46119c(this.f59188e.f59193a);
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            m47787a(Toast.makeText(getContext(), facebookRequestError.mo39341a(), 0));
        }
        if (isAdded()) {
            ActivityC0945e activity = getActivity();
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    /* renamed from: a */
    public final void mo40803a(FacebookRequestError facebookRequestError) {
        m47785a();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        m47786a(intent);
    }

    /* renamed from: a */
    public final void mo40804a(RequestState requestState) {
        this.f59188e = requestState;
        this.f59187d.setText(requestState.f59193a);
        this.f59187d.setVisibility(0);
        this.f59186c.setVisibility(8);
        this.f59189f = m47788b().schedule(new Runnable() {
            /* class com.facebook.share.internal.DeviceShareDialogFragment.RunnableC249323 */

            static {
                Covode.recordClassIndex(30234);
            }

            public final void run() {
                if (!C24677a.m47209a(this)) {
                    try {
                        DeviceShareDialogFragment.this.f59184a.dismiss();
                    } catch (Throwable th) {
                        C24677a.m47208a(th, this);
                    }
                }
            }
        }, requestState.f59194b, TimeUnit.SECONDS);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final Dialog onCreateDialog(Bundle bundle) {
        MethodCollector.m26663i(5581);
        this.f59184a = new Dialog(getActivity(), R.style.ve);
        Bundle bundle2 = null;
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.nb, (ViewGroup) null);
        this.f59186c = (ProgressBar) inflate.findViewById(R.id.d_6);
        this.f59187d = (TextView) inflate.findViewById(R.id.ac0);
        ((Button) inflate.findViewById(R.id.a10)).setOnClickListener(new View.OnClickListener() {
            /* class com.facebook.share.internal.DeviceShareDialogFragment.View$OnClickListenerC249301 */

            static {
                Covode.recordClassIndex(30232);
            }

            public final void onClick(View view) {
                if (!C24677a.m47209a(this)) {
                    try {
                        DeviceShareDialogFragment.this.f59184a.dismiss();
                    } catch (Throwable th) {
                        C24677a.m47208a(th, this);
                    }
                }
            }
        });
        ((TextView) inflate.findViewById(R.id.a86)).setText(Html.fromHtml(getString(R.string.ahc)));
        this.f59184a.setContentView(inflate);
        ShareContent shareContent = this.f59185b;
        if (shareContent != null) {
            if (shareContent instanceof ShareLinkContent) {
                bundle2 = C24966m.m47893a((ShareLinkContent) shareContent);
            } else if (shareContent instanceof ShareOpenGraphContent) {
                bundle2 = C24966m.m47894a((ShareOpenGraphContent) shareContent);
            }
        }
        if (bundle2 == null || bundle2.size() == 0) {
            mo40803a(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        bundle2.putString("access_token", C24699ae.m47305b() + "|" + C24699ae.m47308c());
        bundle2.putString("device_info", C24266a.m46115a());
        new GraphRequest(null, "device/share", bundle2, EnumC24916s.POST, new GraphRequest.AbstractC23858b() {
            /* class com.facebook.share.internal.DeviceShareDialogFragment.C249312 */

            static {
                Covode.recordClassIndex(30233);
            }

            @Override // com.facebook.GraphRequest.AbstractC23858b
            /* renamed from: a */
            public final void mo39350a(C24915r rVar) {
                FacebookRequestError facebookRequestError = rVar.f59155d;
                if (facebookRequestError != null) {
                    DeviceShareDialogFragment.this.mo40803a(facebookRequestError);
                    return;
                }
                JSONObject jSONObject = rVar.f59153b;
                RequestState requestState = new RequestState();
                try {
                    requestState.f59193a = jSONObject.getString("user_code");
                    requestState.f59194b = jSONObject.getLong("expires_in");
                    DeviceShareDialogFragment.this.mo40804a(requestState);
                } catch (JSONException unused) {
                    DeviceShareDialogFragment.this.mo40803a(new FacebookRequestError(0, "", "Malformed server response"));
                }
            }
        }).mo39347a();
        Dialog dialog = this.f59184a;
        MethodCollector.m26664o(5581);
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (!(bundle == null || (requestState = (RequestState) bundle.getParcelable("request_state")) == null)) {
            mo40804a(requestState);
        }
        return onCreateView;
    }
}
