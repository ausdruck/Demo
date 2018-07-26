package com.baidu.mapframework.nirvana.module;

public enum Module {
    UNDEFINED_MODULE(ModuleType.UNDEFINED),
    UNFINISHED_MODULE(ModuleType.UNDEFINED),
    BASE_FRAMEWORK_MODULE(ModuleType.DATA_MODULE),
    QA_FRAMEWORK_MODULE(ModuleType.DATA_MODULE),
    EVENTBUS_MODULE(ModuleType.DATA_MODULE),
    COM_PLATFORM_MODULE(ModuleType.DATA_MODULE),
    SAND_BOX_MODULE(ModuleType.DATA_MODULE),
    MAP_ENGINE(ModuleType.UI_MODULE),
    NAV_MODULE(ModuleType.UI_MODULE),
    NAV_TTS_MODULE(ModuleType.UI_MODULE),
    POI_DETAIL_MODULE(ModuleType.UI_MODULE),
    POI_LIST_MODULE(ModuleType.UI_MODULE),
    POI_SEARCH_MODULE(ModuleType.UI_MODULE),
    SUBWAY_STATION_DETAIL_MODULE(ModuleType.UI_MODULE),
    MAP_APPLICARION_MODULE(ModuleType.UI_MODULE),
    MAP_ACTIVITY_MODULE(ModuleType.UI_MODULE),
    ENTRY_CONTROLLER_MODULE(ModuleType.UI_MODULE),
    MAP_FRAME_MODULE(ModuleType.UI_MODULE),
    NEARBY_MODULE(ModuleType.UI_MODULE),
    USER_CENTER_MODULE(ModuleType.UI_MODULE),
    MESSAGE_MODULE(ModuleType.UI_MODULE),
    ROUTE_CAR_MODULE(ModuleType.UI_MODULE),
    ROUTE_BUS_MODULE(ModuleType.UI_MODULE),
    ROUTE_REALTIME_MODULE(ModuleType.UI_MODULE),
    ROUTE_BIKE_WALK_MODULE(ModuleType.UI_MODULE),
    FAVORITE_MODULE(ModuleType.UI_MODULE),
    LOCAL_MAP_MODULE(ModuleType.UI_MODULE),
    GLIDE_MODULE(ModuleType.UI_MODULE),
    DEFAULT_MAP_LAYOUT_MODULE(ModuleType.UI_MODULE),
    BASE_MAPVIEW_MODULE(ModuleType.UI_MODULE),
    SIRI_MODULE(ModuleType.UI_MODULE),
    VERSION_UPDATE_MODULE(ModuleType.UI_MODULE),
    OPENPI_MODULE(ModuleType.UI_MODULE),
    SETTING_MODULE(ModuleType.UI_MODULE),
    ROAD_CONDITION_VIDEO_MODULE(ModuleType.UI_MODULE),
    COMMON_WIDGET_MODULE(ModuleType.UI_MODULE),
    LOCATION_MODULE(ModuleType.DATA_MODULE),
    HOT_WORD_MODULE(ModuleType.DATA_MODULE),
    NEARBY_HOT_WORD_MODULE(ModuleType.DATA_MODULE),
    LOG_STATISTICS_MODULE(ModuleType.DATA_MODULE),
    MATERIAL_CENTER_MODULE(ModuleType.DATA_MODULE),
    SKIN_MODULE(ModuleType.DATA_MODULE),
    YELLOW_BANNER_MODULE(ModuleType.DATA_MODULE),
    PUSH_MODULE(ModuleType.DATA_MODULE),
    ROAM_INFO_MODULE(ModuleType.DATA_MODULE),
    VOICE_MODULE(ModuleType.DATA_MODULE),
    VOICE_COMPONENT_MODULE(ModuleType.COMPONENT),
    ADVERT_CTRL_MODULE(ModuleType.COMPONENT),
    INDOOR_MODULE(ModuleType.UI_MODULE),
    LAYER_ACTION_MODULE(ModuleType.UI_MODULE),
    UGC_REPORT_MODULE(ModuleType.DATA_MODULE),
    VIDEO_UPLOAD_MODULE(ModuleType.DATA_MODULE),
    ACCOUNT_MODULE(ModuleType.DATA_MODULE),
    NA_CRASH_MODULE(ModuleType.DATA_MODULE),
    SENSOR_MODULE(ModuleType.DATA_MODULE),
    CLOUD_CONTROL_MODULE(ModuleType.DATA_MODULE),
    MYLOCATION_MODULE(ModuleType.DATA_MODULE),
    BUS_SCREENSHOT_MODULE(ModuleType.DATA_MODULE),
    SECURE_MODULE(ModuleType.DATA_MODULE),
    SYNC_MODULE(ModuleType.DATA_MODULE),
    BMES_MODULE(ModuleType.DATA_MODULE),
    WEATHER_MODULE(ModuleType.DATA_MODULE),
    UPLOAD_PIC_MODULE(ModuleType.DATA_MODULE),
    POI_PLACE_MODULE(ModuleType.UI_MODULE),
    RECOMMEND_MODULE(ModuleType.DATA_MODULE),
    SEARCH_FRAMEWORK_MODULE(ModuleType.DATA_MODULE),
    PATCH_MODULE(ModuleType.DATA_MODULE),
    LOC_SHARE_MODULE(ModuleType.COMPONENT),
    TRACK_MODULE(ModuleType.COMPONENT),
    TRAVEL_EXPLORER_MODULE(ModuleType.UI_MODULE),
    STREET_SCAPE_MODULE(ModuleType.UI_MODULE),
    ZOOM_ACTION_MODULE(ModuleType.UI_MODULE),
    LIVE_ROOM_MODULE(ModuleType.COMPONENT),
    TRAVEL_ASSISTANT_MODULE(ModuleType.COMPONENT),
    OPERATION_MODULE(ModuleType.COMPONENT),
    WIFI_MODULE(ModuleType.COMPONENT),
    PANO_MODULE(ModuleType.COMPONENT),
    SCENERY_MODULE(ModuleType.COMPONENT),
    INDOOR_GUARD_MODULE(ModuleType.COMPONENT),
    BRAND_MODULE(ModuleType.COMPONENT),
    DRIVE_MODULE(ModuleType.COMPONENT),
    CAR_OWNER(ModuleType.COMPONENT),
    RENT_CAR(ModuleType.COMPONENT),
    SHARE_BIKE(ModuleType.COMPONENT),
    BRAAVOS_MODULE(ModuleType.COMPONENT),
    INTERNATIONAL_MODULE(ModuleType.COMPONENT),
    WALLET_MODULE(ModuleType.THIRD_SDK),
    WEB_SDK_MODULE(ModuleType.THIRD_SDK),
    SAPI_MODULE(ModuleType.THIRD_SDK),
    ROUTE_MODULE(ModuleType.UI_MODULE),
    ROUTE_DEFAULT_MAP_LAYOUT_MODULE(ModuleType.UI_MODULE),
    SHARE_MODULE(ModuleType.UI_MODULE),
    ROAD_CONDITION_MODULE(ModuleType.UI_MODULE),
    SELECT_POINT_MODULE(ModuleType.UI_MODULE),
    OPERATION_MAP_MODULE(ModuleType.UI_MODULE),
    MY_MAP_MODULE(ModuleType.UI_MODULE),
    NUOMI_HYBRID_MODULE(ModuleType.THIRD_SDK),
    VOICE_INIT_MODULE(ModuleType.THIRD_SDK),
    NETWORK_DETECT(ModuleType.DATA_MODULE);
    
    /* renamed from: a */
    private final ModuleType f19219a;

    private Module(ModuleType type) {
        this.f19219a = type;
    }

    public ModuleType getType() {
        return this.f19219a;
    }
}
