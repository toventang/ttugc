package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.main.C59041az;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.profile.AbstractC63755f;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.utils.fh */
public final class C80429fh extends C80428fg {

    /* renamed from: com.ss.android.ugc.aweme.utils.fh$a */
    public interface AbstractC80433a {
        static {
            Covode.recordClassIndex(93701);
        }

        /* renamed from: a */
        void mo60676a();
    }

    static {
        Covode.recordClassIndex(93697);
    }

    /* renamed from: a */
    public static boolean m139443a(Context context, boolean z, boolean z2) {
        SharedPreferences a = C34822d.m71158a(context, "NotificationGuide", 0);
        if (C80428fg.m139432a(context)) {
            return false;
        }
        if (z2 || z) {
            return true;
        }
        if (a.getInt("guide_show_times", 0) > 0) {
            return false;
        }
        if (System.currentTimeMillis() - a.getLong("guide_last_time", 0) < 60000) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m139440a(Context context, boolean z, AbstractC80433a aVar, boolean z2) {
        m139441a(context, z, aVar, z2, "");
    }

    /* renamed from: a */
    private static void m139441a(Context context, boolean z, AbstractC80433a aVar, boolean z2, String str) {
        m139442a(context, z, null, aVar, z2, false, str, null);
    }

    /* renamed from: a */
    public static void m139442a(final Context context, final boolean z, Runnable runnable, final AbstractC80433a aVar, final boolean z2, final boolean z3, final String str, final AbstractC63755f fVar) {
        final AbstractC63755f.C63756a aVar2;
        if (m139443a(context, z, z3) && Build.VERSION.SDK_INT >= 21) {
            if (fVar != null) {
                try {
                    aVar2 = fVar.mo96118a();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                aVar2 = null;
            }
            if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                C29339a.m58754b(new Runnable(null) {
                    /* class com.p2082ss.android.ugc.aweme.utils.C80429fh.RunnableC804312 */

                    static {
                        Covode.recordClassIndex(93699);
                    }

                    public final void run() {
                        String c;
                        C17197a a;
                        AlertDialog alertDialog;
                        Activity activity = (Activity) context;
                        DialogInterface$OnClickListenerC80434fi fiVar = new DialogInterface$OnClickListenerC80434fi(context, z, aVar2, z3, str, null);
                        DialogInterface$OnClickListenerC80435fj fjVar = new DialogInterface$OnClickListenerC80435fj(z, aVar2, z3, str, context, null);
                        AlertDialog alertDialog2 = null;
                        if (z2) {
                            a = null;
                            alertDialog2 = new AlertDialog.Builder(context).setTitle(R.string.foq).setMessage(R.string.fot).setPositiveButton(R.string.fos, fiVar).setNegativeButton(R.string.f205090for, fjVar).create();
                        } else {
                            C17197a.C17200a aVar = new C17197a.C17200a(context);
                            aVar.f41077h = 2131231558;
                            Context context = context;
                            String c2 = SharePrefCache.inst().getRequestNotificationTitle().mo59941c();
                            if (TextUtils.isEmpty(c2)) {
                                c2 = context.getString(R.string.gf7);
                            }
                            aVar.f41070a = c2;
                            Context context2 = context;
                            if (z) {
                                c = context2.getString(R.string.b5y);
                            } else {
                                c = SharePrefCache.inst().getRequestNotificationText().mo59941c();
                                if (TextUtils.isEmpty(c)) {
                                    c = context2.getString(R.string.b5x);
                                }
                            }
                            aVar.f41071b = c;
                            a = aVar.mo27190a(R.string.a73, (DialogInterface.OnClickListener) fiVar, true).mo27195b(R.string.ctw, (DialogInterface.OnClickListener) fjVar, true).mo27193a();
                        }
                        if (!activity.isFinishing()) {
                            if (alertDialog2 != null) {
                                try {
                                    alertDialog2.setOnShowListener(new DialogInterface.OnShowListener() {
                                        /* class com.p2082ss.android.ugc.aweme.utils.C80429fh.RunnableC804312.DialogInterface$OnShowListenerC804321 */

                                        static {
                                            Covode.recordClassIndex(93700);
                                        }

                                        public final void onShow(DialogInterface dialogInterface) {
                                            if (dialogInterface instanceof AlertDialog) {
                                                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                                                alertDialog.getButton(-1).setTextColor(-16777216);
                                                alertDialog.getButton(-2).setTextColor(-16777216);
                                            }
                                        }
                                    });
                                    alertDialog2.show();
                                    alertDialog = alertDialog2;
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    return;
                                }
                            } else {
                                alertDialog = a.mo27185c();
                            }
                            alertDialog.setCanceledOnTouchOutside(false);
                            alertDialog.setOnDismissListener(new DialogInterface$OnDismissListenerC80436fk(aVar, fVar));
                            if (z) {
                                C39162r.m79460a("notification_setting_alert_show", new C33744d().mo59983a("enter_from", "notification_setting_page").f79943a);
                            } else if (aVar2 != null) {
                                C39162r.m79460a("push_pre_permission_show", new C33744d().mo59983a("enter_from", aVar2.f144527c).mo59983a("enter_method", aVar2.f144528d).mo59983a("room_id", aVar2.f144525a).mo59983a("anchor_id", aVar2.f144526b).mo59983a("enter_reason", "general").f79943a);
                            } else if (z3) {
                                C39162r.m79460a("push_pre_permission_show", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", "notification_bell").mo59983a("enter_reason", "general").f79943a);
                            } else {
                                C39162r.m79460a("push_pre_permission_show", new C33744d().f79943a);
                            }
                        }
                    }
                });
                C59041az.m108523a();
            }
        } else if (aVar != null) {
            aVar.mo60676a();
        }
    }
}
