package com.p2082ss.android.ugc.aweme.account.agegate;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31554b;
import com.p2082ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.C32331a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.b */
public final class C31412b {

    /* renamed from: b */
    public static boolean f75219b;

    /* renamed from: c */
    private static String f75220c = "";

    /* renamed from: a */
    public AbstractC31413a f75221a;

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b$a */
    public interface AbstractC31413a {
        static {
            Covode.recordClassIndex(38130);
        }

        /* renamed from: a */
        void mo57401a();

        /* renamed from: b */
        void mo57402b();

        /* renamed from: c */
        void mo57403c();

        /* renamed from: d */
        void mo57404d();
    }

    static {
        Covode.recordClassIndex(38129);
    }

    /* renamed from: a */
    public static void m65631a(DatePicker datePicker, Date date) {
        Calendar instance = Calendar.getInstance();
        instance.set(6, instance.getActualMaximum(6));
        if (!C31554b.m65835a()) {
            instance.add(1, -1);
        }
        if (date == null) {
            date = C32331a.m66701b();
        }
        if (instance.getTime().before(date)) {
            instance = Calendar.getInstance();
            instance.set(date.getYear() + 1900, 11, 31);
        }
        m65630a(datePicker, instance, date);
    }

    /* renamed from: a */
    public static void m65630a(DatePicker datePicker, Calendar calendar, Date date) {
        datePicker.setNonRecurrentForYear(true);
        datePicker.mo57617a(date);
        datePicker.setUpperBoundDate(calendar);
    }

    /* renamed from: a */
    public static void m65629a(Context context, String str, String str2, int i, String str3, int i2) {
        if (context != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//account/login/signup_or_login");
            buildRoute.withParam("is_existing_user", true);
            buildRoute.withParam("next_page", EnumC32594j.EDIT_DOB_AGE_GATE.getValue());
            buildRoute.withParam("enter_type", "click_login");
            buildRoute.withParam("default_dob", str);
            buildRoute.withParam("enter_method", str2);
            buildRoute.withParam("enter_from", "age_edit_page");
            buildRoute.withParam("user_age_status", i);
            buildRoute.withParam("upper_bound_date", str3);
            buildRoute.withParam("description_type", i2);
            buildRoute.open();
        }
    }
}
