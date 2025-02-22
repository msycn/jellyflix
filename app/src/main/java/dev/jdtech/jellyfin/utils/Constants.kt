package dev.jdtech.jellyfin.utils

object Constants {
    // player
    const val GESTURE_EXCLUSION_AREA_TOP = 48
    const val FULL_SWIPE_RANGE_SCREEN_RATIO = 0.66f
    const val ZOOM_SCALE_BASE = 1f
    const val ZOOM_SCALE_THRESHOLD = 0.01f

    // pref
    const val PREF_CURRENT_SERVER = "pref_current_server"
    const val PREF_PLAYER_GESTURES = "pref_player_gestures"
    const val PREF_PLAYER_GESTURES_VB = "pref_player_gestures_vb"
    const val PREF_PLAYER_GESTURES_ZOOM = "pref_player_gestures_zoom"
    const val PREF_PLAYER_BRIGHTNESS_REMEMBER = "pref_player_brightness_remember"
    const val PREF_PLAYER_BRIGHTNESS = "pref_player_brightness"
    const val PREF_PLAYER_SEEK_BACK_INC = "pref_player_seek_back_inc"
    const val PREF_PLAYER_SEEK_FORWARD_INC = "pref_player_seek_forward_inc"
    const val PREF_IMAGE_CACHE = "pref_image_cache"
    const val PREF_IMAGE_CACHE_SIZE = "pref_image_cache_size"
    const val PREF_THEME = "theme"
    const val PREF_DYNAMIC_COLORS = "dynamic_colors"
    const val PREF_NETWORK_REQUEST_TIMEOUT = "pref_network_request_timeout"
    const val PREF_NETWORK_CONNECT_TIMEOUT = "pref_network_connect_timeout"
    const val PREF_NETWORK_SOCKET_TIMEOUT = "pref_network_socket_timeout"

    // caching
    const val DEFAULT_CACHE_SIZE = 20

    // favorites
    const val FAVORITE_TYPE_MOVIES = 0
    const val FAVORITE_TYPE_SHOWS = 1
    const val FAVORITE_TYPE_EPISODES = 2

    // network
    const val NETWORK_DEFAULT_REQUEST_TIMEOUT = 30_000L
    const val NETWORK_DEFAULT_CONNECT_TIMEOUT = 6_000L
    const val NETWORK_DEFAULT_SOCKET_TIMEOUT = 10_000L
}
