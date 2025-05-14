'use strict';

/**
 * Returns a formatted string with the current day and date
 * Can be used in Wallpaper Engine live wallpapers
 * 
 * @return {String} Formatted day and date (e.g., "Wednesday, May 1, 2025")
 */
export function getFormattedDateTime() {
    const now = new Date();
    
    // Get day of week
    const weekdays = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
    const day = weekdays[now.getDay()];
    
    // Get month
    const months = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];
    const month = months[now.getMonth()];
    
    // Get date and year
    const date = now.getDate();
    const year = now.getFullYear();
    
    // Format the date string
    return `${day}, ${month} ${date}, ${year}`;
}

/**
 * Alternative version using toLocaleDateString if you prefer
 * Note: This might work differently in Wallpaper Engine's JS environment
 * 
 * @return {String} Formatted day and date
 */
export function getFormattedDateTimeAlt() {
    const now = new Date();
    return now.toLocaleDateString('en-US', { 
        weekday: 'long', 
        month: 'long',
        day: 'numeric',
        year: 'numeric'
    });
}