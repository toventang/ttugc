package com.bytedance.bdturing.p863c;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import com.bytedance.bdturing.C13301m;
import com.bytedance.bdturing.twiceverify.C13314c;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.c.d */
public final class C13262d implements AbstractC13255a {

    /* renamed from: a */
    public Activity f32438a;

    static {
        Covode.recordClassIndex(15224);
    }

    public C13262d(Activity activity) {
        this.f32438a = activity;
    }

    @Override // com.bytedance.bdturing.p863c.AbstractC13255a
    /* renamed from: b */
    public final void mo21422b(final C13261c cVar) {
        try {
            if (cVar.f32433b != null) {
                String str = cVar.f32433b;
                char c = 65535;
                switch (str.hashCode()) {
                    case -433891794:
                        if (str.equals("second_verify.close")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -431325456:
                        if (str.equals("second_verify.fetch")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -418116003:
                        if (str.equals("second_verify.toast")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -268991152:
                        if (str.equals("second_verify.hideLoading")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 103102532:
                        if (str.equals("second_verify.isSmsAvailable")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 239578933:
                        if (str.equals("second_verify.showLoading")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1807041893:
                        if (str.equals("second_verify.openSms")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        try {
                            final JSONObject jSONObject = new JSONObject(cVar.f32434c);
                            C13301m.C13302a.f32548a.mo21472a(new Runnable() {
                                /* class com.bytedance.bdturing.p863c.C13262d.RunnableC132631 */

                                static {
                                    Covode.recordClassIndex(15225);
                                }

                                /* JADX WARNING: Removed duplicated region for block: B:65:0x0140  */
                                /* JADX WARNING: Removed duplicated region for block: B:68:0x0147 A[Catch:{ Exception -> 0x01e4, all -> 0x01c5 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:71:0x016a A[Catch:{ Exception -> 0x01e4, all -> 0x01c5 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:73:0x017c A[Catch:{ Exception -> 0x01e4, all -> 0x01c5 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:8:0x0060 A[Catch:{ Exception -> 0x013a }] */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public final void run() {
                                    /*
                                    // Method dump skipped, instructions count: 514
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.p863c.C13262d.RunnableC132631.run():void");
                                }
                            });
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    case 1:
                        JSONObject jSONObject2 = new JSONObject(cVar.f32434c);
                        int optInt = jSONObject2.optInt("status_code");
                        jSONObject2.optString("message");
                        C13314c.AbstractC13316a aVar = C13314c.m23939a().f32565b;
                        if (aVar != null) {
                            if (optInt == 0) {
                                aVar.mo21485a();
                            } else {
                                aVar.mo21486a(optInt);
                            }
                            Activity activity = this.f32438a;
                            if (activity != null) {
                                activity.finish();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        C13314c.m23939a();
                        return;
                    case 3:
                        String optString = new JSONObject(cVar.f32434c).optString("text");
                        Activity activity2 = this.f32438a;
                        if (activity2 != null) {
                            Toast makeText = Toast.makeText(activity2, optString, 0);
                            if (Build.VERSION.SDK_INT == 25) {
                                C80567ic.m139657a(makeText);
                            }
                            makeText.show();
                            return;
                        }
                        return;
                    case 4:
                        new JSONObject(cVar.f32434c).optString("text");
                        if (this.f32438a != null) {
                            C13314c.m23939a();
                            return;
                        }
                        return;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        cVar.mo21430a(1, null);
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        JSONObject jSONObject3 = new JSONObject(cVar.f32434c);
                        String optString2 = jSONObject3.optString("phone_number");
                        String optString3 = jSONObject3.optString("sms_content");
                        if (this.f32438a != null) {
                            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:".concat(String.valueOf(optString2))));
                            intent.putExtra("sms_body", optString3);
                            Activity activity3 = this.f32438a;
                            C84349a.m145093a(intent, activity3);
                            activity3.startActivity(intent);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
