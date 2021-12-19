package com.p2082ss.android.ugc.aweme.lancet;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.lancet.r */
public final class C58037r {
    static {
        Covode.recordClassIndex(68072);
    }

    /* renamed from: a */
    public static void m104858a(final int i) {
        C40780g.m82245b().submit(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.lancet.C58037r.RunnableC580381 */

            static {
                Covode.recordClassIndex(68073);
            }

            public final void run() {
                String str;
                String str2;
                try {
                    int i = i;
                    if (i == 100004) {
                        str = "location_getCurrentLocation";
                    } else if (i != 100403) {
                        switch (i) {
                            case 100000:
                                str = "location_getLastKnownLocation";
                                break;
                            case 100001:
                                str = "location_requestLocationUpdates";
                                break;
                            case 100002:
                                str = "location_requestSingleUpdate";
                                break;
                            default:
                                switch (i) {
                                    case 100100:
                                        str = "camera_open1";
                                        break;
                                    case 100101:
                                        str = "camera_close1";
                                        break;
                                    default:
                                        switch (i) {
                                            case 100200:
                                                str = "camera_open2";
                                                break;
                                            case 100201:
                                                str = "camera_close2";
                                                break;
                                            default:
                                                switch (i) {
                                                    case 100400:
                                                        str = "audio_start";
                                                        break;
                                                    case 100401:
                                                        str = "audio_stop";
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 101800:
                                                                str = "clipboard_clear";
                                                                break;
                                                            case 101801:
                                                                str = "clipboard_addListener";
                                                                break;
                                                            case 101802:
                                                                str = "clipboard_removeListener";
                                                                break;
                                                            case 101803:
                                                                str = "clipboard_getClip";
                                                                break;
                                                            case 101804:
                                                                str = "clipboard_getText";
                                                                break;
                                                            case 101805:
                                                                str = "clipboard_hasClip";
                                                                break;
                                                            case 101806:
                                                                str = "clipboard_hasText";
                                                                break;
                                                            case 101807:
                                                                str = "clipboard_setClip";
                                                                break;
                                                            case 101808:
                                                                str = "clipboard_setText";
                                                                break;
                                                            case 101809:
                                                                str = "clipboard_getDescription";
                                                                break;
                                                            default:
                                                                return;
                                                        }
                                                }
                                        }
                                }
                        }
                    } else {
                        str = "audio_release";
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("eventType", "ENTER_ORIGIN_METHOD");
                    jSONObject.put("entryToken", str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("eventType", "ENTER_ORIGIN_METHOD");
                    jSONObject2.put("entryToken", str);
                    int i2 = i;
                    if (i2 != 100004) {
                        if (i2 != 100403) {
                            switch (i2) {
                                case 100000:
                                case 100001:
                                case 100002:
                                    break;
                                default:
                                    switch (i2) {
                                        default:
                                            switch (i2) {
                                                case 100200:
                                                case 100201:
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case 100400:
                                                        case 100401:
                                                            break;
                                                        default:
                                                            switch (i2) {
                                                                case 101800:
                                                                case 101801:
                                                                case 101802:
                                                                case 101803:
                                                                case 101804:
                                                                case 101805:
                                                                case 101806:
                                                                case 101807:
                                                                case 101808:
                                                                case 101809:
                                                                    str2 = "bpea_event_clipboard";
                                                                    break;
                                                                default:
                                                                    str2 = "bpea_event";
                                                                    break;
                                                            }
                                                    }
                                            }
                                        case 100100:
                                        case 100101:
                                            str2 = "bpea_event_camera";
                                            break;
                                    }
                            }
                            C12290b.m22066a(str2, jSONObject, (JSONObject) null, jSONObject2);
                        }
                        str2 = "bpea_event_microphone";
                        C12290b.m22066a(str2, jSONObject, (JSONObject) null, jSONObject2);
                    }
                    str2 = "bpea_event_location";
                    C12290b.m22066a(str2, jSONObject, (JSONObject) null, jSONObject2);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
