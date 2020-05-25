package moe.shizuku.manager;

public class AppConstants {

    public static final String TAG = "ShizukuManager";

    public static final String NOTIFICATION_CHANNEL_STATUS = "starter";
    public static final String NOTIFICATION_CHANNEL_WORK = "work";
    public static final int NOTIFICATION_ID_STATUS = 1;
    public static final int NOTIFICATION_ID_WORK = 2;

    private static final String PACKAGE = "moe.shizuku.manager";

    // local broadcast actions
    public static final String ACTION_REQUEST_REFRESH = PACKAGE + ".service.action.REQUEST_REFRESH";
}
