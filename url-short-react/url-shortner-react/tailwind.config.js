/** @type {import('tailwindcss').Config} */
export default {
  content: ["./index.html", "./src/**/*.{html,js,jsx}"],
  theme: {
    extend: {
      backgroundImage: {
        "custom-gradient": "linear-gradient(to right , #3b82f6 , #9333ea)",
        "custom-gradient-2": "linear-gradient(to left , #3b82f6 , #f43fSe)",
        "card-gradient": "linear-gradient(to right , #3b8b2ac , #4299e1)",
      },
      colors: {
        navbarColor: "#ffffff",
        btnColor: "#3364F7",
        linkColor: "#2a5bd7",
      },
      boxShadow: {
        custom: "0 0 15px rgba(0 , 0 , 0 , 0.3",
        right: "10 0 10px -5px rgba(0 , 0 , 0 , 0.3",
      },
      fontFamily: {
        roboto: ["Roboto", "sans-serif"],
        montserrat: ["Montserrat"]
      }
    },
  },
  variants: {
    extend: {
      backgroundImage: ["responsive"],
    },
  },
  plugins: [],
}

