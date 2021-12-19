package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.AccessToken;
import com.facebook.AsyncTaskC24911p;
import com.facebook.C24798j;
import com.facebook.C24872m;
import com.facebook.C24915r;
import com.facebook.EnumC24020c;
import com.facebook.EnumC24916s;
import com.facebook.FacebookActivity;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24770r;
import com.facebook.internal.EnumC24692ac;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.login.LoginClient;
import com.facebook.p1814a.C23998m;
import com.facebook.p1858e.p1859a.C24266a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class DeviceAuthDialog extends DialogInterface$OnCancelListenerC0944d {

    /* renamed from: a */
    public AtomicBoolean f58880a = new AtomicBoolean();

    /* renamed from: b */
    public volatile RequestState f58881b;

    /* renamed from: c */
    public Dialog f58882c;

    /* renamed from: d */
    public boolean f58883d = false;

    /* renamed from: e */
    public boolean f58884e = false;

    /* renamed from: f */
    public LoginClient.Request f58885f = null;

    /* renamed from: g */
    private View f58886g;

    /* renamed from: h */
    private TextView f58887h;

    /* renamed from: i */
    private TextView f58888i;

    /* renamed from: j */
    private DeviceAuthMethodHandler f58889j;

    /* renamed from: k */
    private volatile AsyncTaskC24911p f58890k;

    /* renamed from: l */
    private volatile ScheduledFuture f58891l;

    static {
        Covode.recordClassIndex(28991);
    }

    /* renamed from: b */
    private static int m47540b(boolean z) {
        return z ? R.layout.nd : R.layout.nb;
    }

    /* access modifiers changed from: package-private */
    public static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new Parcelable.Creator<RequestState>() {
            /* class com.facebook.login.DeviceAuthDialog.RequestState.C248241 */

            static {
                Covode.recordClassIndex(29000);
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
        public String f58907a;

        /* renamed from: b */
        public String f58908b;

        /* renamed from: c */
        public String f58909c;

        /* renamed from: d */
        public long f58910d;

        /* renamed from: e */
        public long f58911e;

        public int describeContents() {
            return 0;
        }

        RequestState() {
        }

        static {
            Covode.recordClassIndex(28999);
        }

        /* renamed from: a */
        public final boolean mo40652a() {
            if (this.f58911e != 0 && (new Date().getTime() - this.f58911e) - (this.f58910d * 1000) < 0) {
                return true;
            }
            return false;
        }

        protected RequestState(Parcel parcel) {
            this.f58907a = parcel.readString();
            this.f58908b = parcel.readString();
            this.f58909c = parcel.readString();
            this.f58910d = parcel.readLong();
            this.f58911e = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f58907a);
            parcel.writeString(this.f58908b);
            parcel.writeString(this.f58909c);
            parcel.writeLong(this.f58910d);
            parcel.writeLong(this.f58911e);
        }
    }

    /* renamed from: d */
    private GraphRequest m47541d() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.f58881b.f58909c);
        return new GraphRequest(null, "device/login_status", bundle, EnumC24916s.POST, new GraphRequest.AbstractC23858b() {
            /* class com.facebook.login.DeviceAuthDialog.C248204 */

            static {
                Covode.recordClassIndex(28995);
            }

            @Override // com.facebook.GraphRequest.AbstractC23858b
            /* renamed from: a */
            public final void mo39350a(C24915r rVar) {
                JSONException e;
                Date date;
                C248204 r8 = this;
                if (!DeviceAuthDialog.this.f58880a.get()) {
                    FacebookRequestError facebookRequestError = rVar.f59155d;
                    if (facebookRequestError != null) {
                        int i = facebookRequestError.f56433e;
                        if (i != 1349152) {
                            switch (i) {
                                case 1349172:
                                case 1349174:
                                    DeviceAuthDialog.this.mo40646b();
                                    return;
                                case 1349173:
                                    DeviceAuthDialog.this.mo40647c();
                                    return;
                                default:
                                    DeviceAuthDialog.this.mo40642a(rVar.f59155d.f56442n);
                                    return;
                            }
                        } else {
                            if (DeviceAuthDialog.this.f58881b != null) {
                                C24266a.m46119c(DeviceAuthDialog.this.f58881b.f58908b);
                            }
                            if (DeviceAuthDialog.this.f58885f != null) {
                                DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                                deviceAuthDialog.mo40644a(deviceAuthDialog.f58885f);
                                return;
                            }
                            DeviceAuthDialog.this.mo40647c();
                        }
                    } else {
                        try {
                            JSONObject jSONObject = rVar.f59153b;
                            DeviceAuthDialog deviceAuthDialog2 = DeviceAuthDialog.this;
                            String string = jSONObject.getString("access_token");
                            Long valueOf = Long.valueOf(jSONObject.getLong("expires_in"));
                            Long valueOf2 = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                            Bundle bundle = new Bundle();
                            bundle.putString("fields", "id,permissions,name");
                            Date date2 = null;
                            if (valueOf.longValue() != 0) {
                                try {
                                    long time = new Date().getTime();
                                    long longValue = valueOf.longValue();
                                    Long.signum(longValue);
                                    date = new Date(time + (longValue * 1000));
                                } catch (JSONException e2) {
                                    e = e2;
                                    DeviceAuthDialog.this.mo40642a(new C24798j(e));
                                }
                            } else {
                                date = null;
                            }
                            if (valueOf2.longValue() != 0) {
                                date2 = new Date(valueOf2.longValue() * 1000);
                            }
                            C24699ae.m47299a();
                            new GraphRequest(new AccessToken(string, C24872m.f59041a, "0", null, null, null, null, date, null, date2), "me", bundle, EnumC24916s.GET, new GraphRequest.AbstractC23858b(string, date, date2) {
                                /* class com.facebook.login.DeviceAuthDialog.C248237 */

                                /* renamed from: a */
                                final /* synthetic */ String f58903a;

                                /* renamed from: b */
                                final /* synthetic */ Date f58904b;

                                /* renamed from: c */
                                final /* synthetic */ Date f58905c;

                                static {
                                    Covode.recordClassIndex(28998);
                                }

                                @Override // com.facebook.GraphRequest.AbstractC23858b
                                /* renamed from: a */
                                public final void mo39350a(C24915r rVar) {
                                    String optString;
                                    if (!DeviceAuthDialog.this.f58880a.get()) {
                                        if (rVar.f59155d != null) {
                                            DeviceAuthDialog.this.mo40642a(rVar.f59155d.f56442n);
                                            return;
                                        }
                                        try {
                                            JSONObject jSONObject = rVar.f59153b;
                                            String string = jSONObject.getString("id");
                                            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
                                            ArrayList arrayList = new ArrayList(jSONArray.length());
                                            ArrayList arrayList2 = new ArrayList(jSONArray.length());
                                            ArrayList arrayList3 = new ArrayList(jSONArray.length());
                                            for (int i = 0; i < jSONArray.length(); i++) {
                                                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                                                String optString2 = optJSONObject.optString("permission");
                                                if (!(optString2 == null || optString2.equals("installed") || (optString = optJSONObject.optString("status")) == null)) {
                                                    if (optString.equals("granted")) {
                                                        arrayList.add(optString2);
                                                    } else if (optString.equals("declined")) {
                                                        arrayList2.add(optString2);
                                                    } else if (optString.equals("expired")) {
                                                        arrayList3.add(optString2);
                                                    }
                                                }
                                            }
                                            C24693ad.C24698c cVar = new C24693ad.C24698c(arrayList, arrayList2, arrayList3);
                                            String string2 = jSONObject.getString(StringSet.name);
                                            C24266a.m46119c(DeviceAuthDialog.this.f58881b.f58908b);
                                            C24699ae.m47299a();
                                            if (!C24770r.m47425a(C24872m.f59041a).f58757e.contains(EnumC24692ac.RequireConfirm) || DeviceAuthDialog.this.f58884e) {
                                                DeviceAuthDialog.this.mo40645a(string, cVar, this.f58903a, this.f58904b, this.f58905c);
                                                return;
                                            }
                                            DeviceAuthDialog.this.f58884e = true;
                                            DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                                            String str = this.f58903a;
                                            Date date = this.f58904b;
                                            Date date2 = this.f58905c;
                                            String string3 = deviceAuthDialog.getResources().getString(R.string.ahx);
                                            String string4 = deviceAuthDialog.getResources().getString(R.string.ahw);
                                            String string5 = deviceAuthDialog.getResources().getString(R.string.ahv);
                                            String a = C1764a.m5928a(string4, new Object[]{string2});
                                            AlertDialog.Builder builder = new AlertDialog.Builder(deviceAuthDialog.getContext());
                                            builder.setMessage(string3).setCancelable(true).setNegativeButton(a, new DialogInterface.OnClickListener(string, cVar, str, date, date2) {
                                                /* class com.facebook.login.DeviceAuthDialog.DialogInterface$OnClickListenerC248226 */

                                                /* renamed from: a */
                                                final /* synthetic */ String f58897a;

                                                /* renamed from: b */
                                                final /* synthetic */ C24693ad.C24698c f58898b;

                                                /* renamed from: c */
                                                final /* synthetic */ String f58899c;

                                                /* renamed from: d */
                                                final /* synthetic */ Date f58900d;

                                                /* renamed from: e */
                                                final /* synthetic */ Date f58901e;

                                                static {
                                                    Covode.recordClassIndex(28997);
                                                }

                                                public final void onClick(DialogInterface dialogInterface, int i) {
                                                    DeviceAuthDialog.this.mo40645a(this.f58897a, this.f58898b, this.f58899c, this.f58900d, this.f58901e);
                                                }

                                                {
                                                    this.f58897a = r2;
                                                    this.f58898b = r3;
                                                    this.f58899c = r4;
                                                    this.f58900d = r5;
                                                    this.f58901e = r6;
                                                }
                                            }).setPositiveButton(string5, new DialogInterface.OnClickListener() {
                                                /* class com.facebook.login.DeviceAuthDialog.DialogInterface$OnClickListenerC248215 */

                                                static {
                                                    Covode.recordClassIndex(28996);
                                                }

                                                public final void onClick(DialogInterface dialogInterface, int i) {
                                                    DeviceAuthDialog.this.f58882c.setContentView(DeviceAuthDialog.this.mo40640a(false));
                                                    DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                                                    deviceAuthDialog.mo40644a(deviceAuthDialog.f58885f);
                                                }
                                            });
                                            builder.create().show();
                                        } catch (JSONException e) {
                                            DeviceAuthDialog.this.mo40642a(new C24798j(e));
                                        }
                                    }
                                }

                                {
                                    this.f58903a = r2;
                                    this.f58904b = r3;
                                    this.f58905c = r4;
                                }
                            }).mo39347a();
                        } catch (JSONException e3) {
                            e = e3;
                            r8 = this;
                            DeviceAuthDialog.this.mo40642a(new C24798j(e));
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo40641a() {
        this.f58881b.f58911e = new Date().getTime();
        this.f58890k = m47541d().mo39347a();
    }

    /* renamed from: b */
    public final void mo40646b() {
        this.f58891l = DeviceAuthMethodHandler.m47554c().schedule(new Runnable() {
            /* class com.facebook.login.DeviceAuthDialog.RunnableC248193 */

            static {
                Covode.recordClassIndex(28994);
            }

            public final void run() {
                if (!C24677a.m47209a(this)) {
                    try {
                        DeviceAuthDialog.this.mo40641a();
                    } catch (Throwable th) {
                        C24677a.m47208a(th, this);
                    }
                }
            }
        }, this.f58881b.f58910d, TimeUnit.SECONDS);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f58883d = true;
        this.f58880a.set(true);
        super.onDestroyView();
        if (this.f58890k != null) {
            this.f58890k.cancel(true);
        }
        if (this.f58891l != null) {
            this.f58891l.cancel(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo40647c() {
        if (this.f58880a.compareAndSet(false, true)) {
            if (this.f58881b != null) {
                C24266a.m46119c(this.f58881b.f58908b);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f58889j;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.mo40659b();
            }
            this.f58882c.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.f58883d) {
            mo40647c();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f58881b != null) {
            bundle.putParcelable("request_state", this.f58881b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40642a(C24798j jVar) {
        if (this.f58880a.compareAndSet(false, true)) {
            if (this.f58881b != null) {
                C24266a.m46119c(this.f58881b.f58908b);
            }
            this.f58889j.mo40657a(jVar);
            this.f58882c.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        this.f58882c = new Dialog(getActivity(), R.style.ve);
        if (!C24266a.m46118b() || this.f58884e) {
            z = false;
        } else {
            z = true;
        }
        this.f58882c.setContentView(mo40640a(z));
        return this.f58882c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo40640a(boolean z) {
        MethodCollector.m26663i(5424);
        View inflate = getActivity().getLayoutInflater().inflate(m47540b(z), (ViewGroup) null);
        this.f58886g = inflate.findViewById(R.id.d_6);
        this.f58887h = (TextView) inflate.findViewById(R.id.ac0);
        ((Button) inflate.findViewById(R.id.a10)).setOnClickListener(new View.OnClickListener() {
            /* class com.facebook.login.DeviceAuthDialog.View$OnClickListenerC248182 */

            static {
                Covode.recordClassIndex(28993);
            }

            public final void onClick(View view) {
                if (!C24677a.m47209a(this)) {
                    try {
                        DeviceAuthDialog.this.mo40647c();
                    } catch (Throwable th) {
                        C24677a.m47208a(th, this);
                    }
                }
            }
        });
        TextView textView = (TextView) inflate.findViewById(R.id.a86);
        this.f58888i = textView;
        textView.setText(Html.fromHtml(getString(R.string.ahc)));
        MethodCollector.m26664o(5424);
        return inflate;
    }

    /* renamed from: a */
    public final void mo40643a(RequestState requestState) {
        this.f58881b = requestState;
        this.f58887h.setText(requestState.f58908b);
        this.f58888i.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new BitmapDrawable(getResources(), C24266a.m46117b(requestState.f58907a)), (Drawable) null, (Drawable) null);
        this.f58887h.setVisibility(0);
        this.f58886g.setVisibility(8);
        if (!this.f58884e && C24266a.m46116a(requestState.f58908b)) {
            new C23998m(getContext()).mo39476b();
        }
        if (requestState.mo40652a()) {
            mo40646b();
        } else {
            mo40641a();
        }
    }

    /* renamed from: a */
    public final void mo40644a(LoginClient.Request request) {
        this.f58885f = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.f58932b));
        String str = request.f58937g;
        if (str != null) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = request.f58939i;
        if (str2 != null) {
            bundle.putString("target_user_id", str2);
        }
        bundle.putString("access_token", C24699ae.m47305b() + "|" + C24699ae.m47308c());
        bundle.putString("device_info", C24266a.m46115a());
        new GraphRequest(null, "device/login", bundle, EnumC24916s.POST, new GraphRequest.AbstractC23858b() {
            /* class com.facebook.login.DeviceAuthDialog.C248171 */

            static {
                Covode.recordClassIndex(28992);
            }

            @Override // com.facebook.GraphRequest.AbstractC23858b
            /* renamed from: a */
            public final void mo39350a(C24915r rVar) {
                if (!DeviceAuthDialog.this.f58883d) {
                    if (rVar.f59155d != null) {
                        DeviceAuthDialog.this.mo40642a(rVar.f59155d.f56442n);
                        return;
                    }
                    JSONObject jSONObject = rVar.f59153b;
                    RequestState requestState = new RequestState();
                    try {
                        String string = jSONObject.getString("user_code");
                        requestState.f58908b = string;
                        requestState.f58907a = C1764a.m5929a(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[]{string});
                        requestState.f58909c = jSONObject.getString("code");
                        requestState.f58910d = jSONObject.getLong("interval");
                        DeviceAuthDialog.this.mo40643a(requestState);
                    } catch (JSONException e) {
                        DeviceAuthDialog.this.mo40642a(new C24798j(e));
                    }
                }
            }
        }).mo39347a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f58889j = (DeviceAuthMethodHandler) ((C24865e) ((FacebookActivity) getActivity()).f56427b).f59026a.mo40675a();
        if (!(bundle == null || (requestState = (RequestState) bundle.getParcelable("request_state")) == null)) {
            mo40643a(requestState);
        }
        return onCreateView;
    }

    /* renamed from: a */
    public final void mo40645a(String str, C24693ad.C24698c cVar, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.f58889j;
        C24699ae.m47299a();
        deviceAuthMethodHandler.mo40658a(str2, C24872m.f59041a, str, cVar.f58633a, cVar.f58634b, cVar.f58635c, EnumC24020c.DEVICE_AUTH, date, date2);
        this.f58882c.dismiss();
    }
}
